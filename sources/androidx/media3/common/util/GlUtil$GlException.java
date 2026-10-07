package androidx.media3.common.util;

import defpackage.a98;
import defpackage.c98;
import defpackage.ghe;

/* JADX INFO: loaded from: classes2.dex */
public final class GlUtil$GlException extends Exception {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GlUtil$GlException(String str) {
        this(str, ghe.e);
        a98 a98Var = c98.b;
    }

    public GlUtil$GlException(String str, ghe gheVar) {
        super(str);
        c98.n(gheVar);
    }
}
