package com.facebook.imagepipeline.nativecode;

import defpackage.i68;
import defpackage.kb5;
import defpackage.x78;
import defpackage.y78;

/* JADX INFO: loaded from: classes.dex */
public class NativeJpegTranscoderFactory implements y78 {
    public final int a;
    public final boolean b;
    public final boolean c;

    public NativeJpegTranscoderFactory(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.y78
    public x78 createImageTranscoder(i68 i68Var, boolean z) {
        if (i68Var != kb5.a) {
            return null;
        }
        return new NativeJpegTranscoder(this.a, z, this.b, this.c);
    }
}
