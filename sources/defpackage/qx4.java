package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qx4 extends mdh implements qf7 {
    public final /* synthetic */ int e;
    public l9b f;
    public rx4 g;
    public int h;
    public final /* synthetic */ rx4 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qx4(rx4 rx4Var, lq4 lq4Var, int i) {
        super(2, lq4Var);
        this.e = i;
        this.i = rx4Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        int i = this.e;
        rx4 rx4Var = this.i;
        switch (i) {
            case 0:
                return new qx4(rx4Var, lq4Var, 0);
            case 1:
                return new qx4(rx4Var, lq4Var, 1);
            default:
                return new qx4(rx4Var, lq4Var, 2);
        }
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.e;
        sbi sbiVar = sbi.a;
        gu4 gu4Var = (gu4) obj;
        lq4 lq4Var = (lq4) obj2;
        switch (i) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((qx4) create(gu4Var, lq4Var)).invokeSuspend(sbiVar);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:54:0x00e2 A[Catch: all -> 0x00ff, TryCatch #2 {all -> 0x00ff, blocks: (B:51:0x00d8, B:55:0x00e6, B:57:0x00ea, B:60:0x00f1, B:62:0x00f9, B:67:0x0106, B:54:0x00e2), top: B:103:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ea A[Catch: all -> 0x00ff, TryCatch #2 {all -> 0x00ff, blocks: (B:51:0x00d8, B:55:0x00e6, B:57:0x00ea, B:60:0x00f1, B:62:0x00f9, B:67:0x0106, B:54:0x00e2), top: B:103:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1 A[Catch: all -> 0x00ff, TryCatch #2 {all -> 0x00ff, blocks: (B:51:0x00d8, B:55:0x00e6, B:57:0x00ea, B:60:0x00f1, B:62:0x00f9, B:67:0x0106, B:54:0x00e2), top: B:103:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f9 A[Catch: all -> 0x00ff, TRY_LEAVE, TryCatch #2 {all -> 0x00ff, blocks: (B:51:0x00d8, B:55:0x00e6, B:57:0x00ea, B:60:0x00f1, B:62:0x00f9, B:67:0x0106, B:54:0x00e2), top: B:103:0x00d8 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0106 A[Catch: all -> 0x00ff, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00ff, blocks: (B:51:0x00d8, B:55:0x00e6, B:57:0x00ea, B:60:0x00f1, B:62:0x00f9, B:67:0x0106, B:54:0x00e2), top: B:103:0x00d8 }] */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        rx4 rx4Var;
        l9b l9bVar;
        rx4 rx4Var2;
        l9b l9bVar2;
        zv zvVar;
        Object objRemoveLast;
        kbi kbiVar;
        String str;
        a4c a4cVar;
        je9 je9Var;
        rx4 rx4Var3;
        l9b l9bVar3;
        switch (this.e) {
            case 0:
                sbi sbiVar = sbi.a;
                hu4 hu4Var = hu4.a;
                int i = this.h;
                if (i == 0) {
                    ch3.d0(obj);
                    rx4Var = this.i;
                    l9b l9bVar4 = rx4Var.u;
                    this.f = l9bVar4;
                    this.g = rx4Var;
                    this.h = 1;
                    if (l9bVar4.b(this) == hu4Var) {
                        return hu4Var;
                    }
                    l9bVar = l9bVar4;
                } else {
                    if (i != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rx4Var = this.g;
                    l9bVar = this.f;
                    ch3.d0(obj);
                }
                try {
                    long j = rx4Var.k;
                    int i2 = (int) (j >> 32);
                    if (Float.intBitsToFloat(i2) != -1.0f) {
                        int i3 = (int) (4294967295L & j);
                        if (Float.intBitsToFloat(i3) != -1.0f) {
                            rx4Var.l.postScale(-1.0f, 1.0f, Float.intBitsToFloat(i2) / 2.0f, Float.intBitsToFloat(i3) / 2.0f);
                        }
                        return sbiVar;
                    }
                    String str2 = rx4Var.p;
                    a4c a4cVar2 = gm0.f;
                    if (a4cVar2 != null) {
                        je9 je9Var2 = je9.f;
                        if (a4cVar2.b(je9Var2)) {
                            a4cVar2.c(je9Var2, str2, "Image size is not set when attempting to flip horizontally", null);
                        }
                    }
                    return sbiVar;
                } finally {
                    l9bVar.g(null);
                }
            case 1:
                sbi sbiVar2 = sbi.a;
                hu4 hu4Var2 = hu4.a;
                int i4 = this.h;
                if (i4 == 0) {
                    ch3.d0(obj);
                    sgg sggVar = this.i.v;
                    if (sggVar != null) {
                        this.h = 1;
                        if (sggVar.g(this) != hu4Var2) {
                        }
                    }
                    return hu4Var2;
                }
                if (i4 == 1) {
                    ch3.d0(obj);
                } else {
                    if (i4 != 2) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rx4Var2 = this.g;
                    l9bVar2 = this.f;
                    ch3.d0(obj);
                }
                try {
                    zvVar = rx4Var2.y;
                    if (zvVar.isEmpty()) {
                        objRemoveLast = null;
                    } else {
                        objRemoveLast = zvVar.removeLast();
                    }
                    kbiVar = (kbi) objRemoveLast;
                    if (kbiVar == null) {
                        str = rx4Var2.p;
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "Undo stack is empty when attempting to handle undo action", null);
                            }
                        }
                    } else {
                        nx4 nx4Var = kbiVar.b;
                        rx4Var2.l.setValues(nx4Var.a);
                        rx4Var2.s = nx4Var.b;
                        rx4Var2.x = nx4Var.c;
                        rx4Var2.J();
                        a8j.x(rx4Var2.j, new rw4(kbiVar.a, rx4Var2.x));
                    }
                    return sbiVar2;
                } finally {
                    l9bVar2.g(null);
                }
                rx4 rx4Var4 = this.i;
                l9b l9bVar5 = rx4Var4.u;
                this.f = l9bVar5;
                this.g = rx4Var4;
                this.h = 2;
                if (l9bVar5.b(this) != hu4Var2) {
                    rx4Var2 = rx4Var4;
                    l9bVar2 = l9bVar5;
                    zvVar = rx4Var2.y;
                    if (zvVar.isEmpty()) {
                        objRemoveLast = null;
                    } else {
                        objRemoveLast = zvVar.removeLast();
                    }
                    kbiVar = (kbi) objRemoveLast;
                    if (kbiVar == null) {
                        str = rx4Var2.p;
                        a4cVar = gm0.f;
                        if (a4cVar == null) {
                            je9Var = je9.f;
                            if (a4cVar.b(je9Var)) {
                                a4cVar.c(je9Var, str, "Undo stack is empty when attempting to handle undo action", null);
                            }
                        }
                    } else {
                        nx4 nx4Var2 = kbiVar.b;
                        rx4Var2.l.setValues(nx4Var2.a);
                        rx4Var2.s = nx4Var2.b;
                        rx4Var2.x = nx4Var2.c;
                        rx4Var2.J();
                        a8j.x(rx4Var2.j, new rw4(kbiVar.a, rx4Var2.x));
                    }
                    return sbiVar2;
                }
                return hu4Var2;
            default:
                sbi sbiVar3 = sbi.a;
                hu4 hu4Var3 = hu4.a;
                int i5 = this.h;
                if (i5 == 0) {
                    ch3.d0(obj);
                    rx4Var3 = this.i;
                    l9b l9bVar6 = rx4Var3.u;
                    this.f = l9bVar6;
                    this.g = rx4Var3;
                    this.h = 1;
                    if (l9bVar6.b(this) == hu4Var3) {
                        return hu4Var3;
                    }
                    l9bVar3 = l9bVar6;
                } else {
                    if (i5 != 1) {
                        ore.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rx4Var3 = this.g;
                    l9bVar3 = this.f;
                    ch3.d0(obj);
                }
                try {
                    long j2 = rx4Var3.k;
                    int i6 = (int) (j2 >> 32);
                    if (Float.intBitsToFloat(i6) != -1.0f) {
                        int i7 = (int) (4294967295L & j2);
                        if (Float.intBitsToFloat(i7) != -1.0f) {
                            if (rx4Var3.l.postRotate(90.0f, Float.intBitsToFloat(i6) / 2.0f, Float.intBitsToFloat(i7) / 2.0f)) {
                                rx4Var3.s = !rx4Var3.s;
                            }
                        }
                        return sbiVar3;
                    }
                    String str3 = rx4Var3.p;
                    a4c a4cVar3 = gm0.f;
                    if (a4cVar3 != null) {
                        je9 je9Var3 = je9.f;
                        if (a4cVar3.b(je9Var3)) {
                            a4cVar3.c(je9Var3, str3, "Image size is not set when attempting to rotate", null);
                        }
                    }
                    return sbiVar3;
                } finally {
                    l9bVar3.g(null);
                }
        }
    }
}
