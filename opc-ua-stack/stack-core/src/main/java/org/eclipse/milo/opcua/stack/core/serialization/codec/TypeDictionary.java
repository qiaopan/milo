/*
 * Copyright (c) 2016 Kevin Herron
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v1.0 which accompany this distribution.
 *
 * The Eclipse Public License is available at
 *   http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at
 *   http://www.eclipse.org/org/documents/edl-v10.html.
 */

package org.eclipse.milo.opcua.stack.core.serialization.codec;

import org.eclipse.milo.opcua.stack.core.types.builtin.NodeId;

public interface TypeDictionary {

    String getNamespaceUri();

    void registerBinaryCodec(OpcBinaryTypeCodec<?> codec, String typeName);

    void registerBinaryCodec(OpcBinaryTypeCodec<?> codec, String typeName, NodeId binaryEncodingId);

    void registerXmlCodec(OpcXmlTypeCodec<?> codec, String typeName);

    void registerXmlCodec(OpcXmlTypeCodec<?> codec, String typeName, NodeId xmlEncodingId);

    OpcBinaryTypeCodec<?> getBinaryCodec(NodeId encodingId);

    OpcBinaryTypeCodec<?> getBinaryCodec(String typeName);

    OpcXmlTypeCodec<?> getXmlCodec(NodeId encodingId);

    OpcXmlTypeCodec<?> getXmlCodec(String typeName);

}