package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class ce1 {
    public final Context a;
    public final ny8 b = rx8.P(3, new qo7(28, this));

    public ce1(Context context) {
        this.a = context;
    }

    public final qe1 a(be1 be1Var) {
        Long l = be1Var.a;
        Long l2 = be1Var.f;
        CharSequence charSequence = be1Var.g;
        return new qe1(l, be1Var.c, be1Var.m, new ok0((l2 == null || charSequence == null) ? null : gm0.a(charSequence, Long.valueOf(l2.longValue())), be1Var.e), be1Var.h ? (qk0) this.b.getValue() : null, be1Var.h, null, null, be1Var.i, 192);
    }
}
