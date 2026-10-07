package defpackage;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ov9 {
    public final ou9 a;
    public final x2d b;
    public final d0a c;
    public final List d;
    public final CharSequence e;
    public final int f;
    public final int g;
    public final Bundle h;

    public ov9(ov9 ov9Var) {
        this.a = ov9Var.a;
        this.b = ov9Var.b;
        this.c = ov9Var.c;
        this.d = ov9Var.d;
        this.e = ov9Var.e;
        this.f = ov9Var.f;
        this.g = ov9Var.g;
        this.h = ov9Var.h;
    }

    public ov9(ou9 ou9Var, x2d x2dVar, d0a d0aVar, List list, CharSequence charSequence, int i, int i2, Bundle bundle) {
        this.a = ou9Var;
        this.b = x2dVar;
        this.c = d0aVar;
        list.getClass();
        this.d = list;
        this.e = charSequence;
        this.f = i;
        this.g = i2;
        this.h = bundle == null ? Bundle.EMPTY : bundle;
    }

    public ov9() {
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = Collections.EMPTY_LIST;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = Bundle.EMPTY;
    }
}
