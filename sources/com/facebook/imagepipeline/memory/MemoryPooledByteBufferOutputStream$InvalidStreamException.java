package com.facebook.imagepipeline.memory;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/facebook/imagepipeline/memory/MemoryPooledByteBufferOutputStream$InvalidStreamException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "imagepipeline_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MemoryPooledByteBufferOutputStream$InvalidStreamException extends RuntimeException {
    public MemoryPooledByteBufferOutputStream$InvalidStreamException() {
        super("OutputStream no longer valid");
    }
}
