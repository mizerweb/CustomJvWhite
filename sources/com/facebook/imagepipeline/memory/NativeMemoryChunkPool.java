package com.facebook.imagepipeline.memory;

import defpackage.cbd;
import defpackage.dbd;
import defpackage.uba;
import defpackage.waa;

/* JADX INFO: loaded from: classes.dex */
public class NativeMemoryChunkPool extends waa {
    public NativeMemoryChunkPool(uba ubaVar, cbd cbdVar, dbd dbdVar) {
        super(ubaVar, cbdVar, dbdVar);
    }

    @Override // defpackage.cs0
    public final Object f(int i) {
        return new NativeMemoryChunk(i);
    }
}
