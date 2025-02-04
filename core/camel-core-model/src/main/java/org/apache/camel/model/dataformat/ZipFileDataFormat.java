/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.model.dataformat;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

import org.apache.camel.model.DataFormatDefinition;
import org.apache.camel.spi.Metadata;

/**
 * Compression and decompress streams using java.util.zip.Zip*Stream.
 */
@Metadata(firstVersion = "2.11.0", label = "dataformat,transformation,file", title = "Zip File")
@XmlRootElement(name = "zipFile")
@XmlAccessorType(XmlAccessType.FIELD)
public class ZipFileDataFormat extends DataFormatDefinition {

    @XmlAttribute
    @Metadata(javaType = "java.lang.Boolean")
    private String usingIterator;
    @XmlAttribute
    @Metadata(javaType = "java.lang.Boolean")
    private String allowEmptyDirectory;
    @XmlAttribute
    @Metadata(javaType = "java.lang.Boolean")
    private String preservePathElements;
    @XmlAttribute
    @Metadata(label = "advanced", javaType = "java.lang.Long", defaultValue = "1073741824")
    private String maxDecompressedSize;

    public ZipFileDataFormat() {
        super("zipFile");
    }

    public String getUsingIterator() {
        return usingIterator;
    }

    public String getAllowEmptyDirectory() {
        return allowEmptyDirectory;
    }

    public String getPreservePathElements() {
        return preservePathElements;
    }

    public String getMaxDecompressedSize() {
        return maxDecompressedSize;
    }

    /**
     * If the zip file has more than one entry, the setting this option to true, allows working with the splitter EIP,
     * to split the data using an iterator in a streaming mode.
     */
    public void setUsingIterator(String usingIterator) {
        this.usingIterator = usingIterator;
    }

    /**
     * If the zip file has more than one entry, setting this option to true, allows to get the iterator even if the
     * directory is empty
     */
    public void setAllowEmptyDirectory(String allowEmptyDirectory) {
        this.allowEmptyDirectory = allowEmptyDirectory;
    }

    /**
     * If the file name contains path elements, setting this option to true, allows the path to be maintained in the zip
     * file.
     */
    public void setPreservePathElements(String preservePathElements) {
        this.preservePathElements = preservePathElements;
    }

    /**
     * Set the maximum decompressed size of a zip file (in bytes). The default value if not specified corresponds to 1
     * gigabyte. An IOException will be thrown if the decompressed size exceeds this amount. Set to -1 to disable
     * setting a maximum decompressed size.
     *
     * @param maxDecompressedSize the maximum decompressed size of a zip file (in bytes)
     */
    public void setMaxDecompressedSize(String maxDecompressedSize) {
        this.maxDecompressedSize = maxDecompressedSize;
    }
}
