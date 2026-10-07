package com.google.android.datatransport.cct;

import android.content.Context;
import defpackage.c4i;
import defpackage.ch0;
import defpackage.go2;
import defpackage.xv4;

/* JADX INFO: loaded from: classes2.dex */
public class CctBackendFactory {
    public c4i create(xv4 xv4Var) {
        Context context = ((ch0) xv4Var).a;
        ch0 ch0Var = (ch0) xv4Var;
        return new go2(context, ch0Var.b, ch0Var.c);
    }
}
