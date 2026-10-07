package com.google.android.gms.common.internal;

import defpackage.le4;
import defpackage.yab;

/* JADX INFO: loaded from: classes2.dex */
public final class zzaf extends Exception {
    public final le4 a;

    public zzaf(le4 le4Var) {
        yab.n("ResolvableConnectionException can only be created with a connection result containing a resolution.", (le4Var.b == 0 || le4Var.c == null) ? false : true);
        this.a = le4Var;
    }
}
