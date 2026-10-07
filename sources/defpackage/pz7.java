package defpackage;

import ru.ok.android.externcalls.sdk.audio.internal.impl3.CallsAudioManagerV3Impl;

/* JADX INFO: loaded from: classes2.dex */
public final class pz7 extends mdh implements qf7 {
    public int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ tz7 g;
    public String h;
    public int i;
    public int j;
    public boolean k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz7(Object obj, lq4 lq4Var, tz7 tz7Var) {
        super(2, lq4Var);
        this.f = obj;
        this.g = tz7Var;
    }

    @Override // defpackage.mq0
    public final lq4 create(Object obj, lq4 lq4Var) {
        return new pz7(this.f, lq4Var, this.g);
    }

    @Override // defpackage.qf7
    public final Object invoke(Object obj, Object obj2) {
        return ((pz7) create((gu4) obj, (lq4) obj2)).invokeSuspend(sbi.a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x009f  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:45:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:47:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    @Override // defpackage.mq0
    public final Object invokeSuspend(Object obj) {
        String str;
        boolean zD;
        int i;
        int i2;
        Object objL0;
        int i3;
        String str2;
        boolean z;
        Boolean bool;
        boolean zBooleanValue;
        tz7 tz7Var = this.g;
        ny8 ny8Var = tz7Var.b;
        int i4 = this.e;
        int i5 = 2;
        hu4 hu4Var = hu4.a;
        if (i4 != 0) {
            if (i4 == 1) {
                zD = this.k;
                i = this.i;
                str = this.h;
                ch3.d0(obj);
            } else {
                if (i4 != 2) {
                    ore.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i3 = this.j;
                str2 = this.h;
                ch3.d0(obj);
            }
            bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                str = str2;
                i2 = i3;
                i3 = i2;
                z = true;
                str2 = str;
            } else {
                z = false;
            }
            if (i3 == 0 && z) {
                i5 = 3;
            } else if (!z) {
                if (i3 != 0) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
            }
            return new ylc(str2, new Integer(i5));
        }
        ch3.d0(obj);
        str = (String) this.f;
        ((w69) tz7Var.d.getValue()).getClass();
        zD = cqk.d(str, "api2.oneme.ru");
        if (zD && ((onf) ny8Var.getValue()).isConnected()) {
            i = 0;
            if (zD || !((onf) ny8Var.getValue()).isConnected()) {
                qz7 qz7Var = new qz7(tz7Var, str, null, 0);
                this.h = str;
                this.i = i;
                this.k = zD;
                this.j = i2;
                this.e = 2;
                objL0 = lvb.L0(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, qz7Var, this);
                if (objL0 != hu4Var) {
                    i3 = i2;
                    obj = objL0;
                    str2 = str;
                    bool = (Boolean) obj;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        str = str2;
                        i2 = i3;
                        i3 = i2;
                        z = true;
                        str2 = str;
                    } else {
                        z = false;
                    }
                }
            } else {
                i3 = i2;
                z = true;
                str2 = str;
            }
            if (i3 == 0) {
                if (!z) {
                    if (i3 != 0) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
            } else if (!z) {
                if (i3 != 0) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
            }
            return new ylc(str2, new Integer(i5));
        }
        qz7 qz7Var2 = new qz7(tz7Var, str, null, 1);
        this.h = str;
        this.i = 0;
        this.k = zD;
        this.e = 1;
        obj = lvb.L0(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, qz7Var2, this);
        if (obj != hu4Var) {
            i = 0;
        }
        return hu4Var;
        Boolean bool2 = (Boolean) obj;
        i2 = bool2 != null ? bool2.booleanValue() : false ? 1 : 0;
        if (zD) {
        }
        qz7 qz7Var3 = new qz7(tz7Var, str, null, 0);
        this.h = str;
        this.i = i;
        this.k = zD;
        this.j = i2;
        this.e = 2;
        objL0 = lvb.L0(CallsAudioManagerV3Impl.USED_DEVICE_RECOVER_TIMEOUT_MS, qz7Var3, this);
        if (objL0 != hu4Var) {
            i3 = i2;
            obj = objL0;
            str2 = str;
            bool = (Boolean) obj;
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                str = str2;
                i2 = i3;
                i3 = i2;
                z = true;
                str2 = str;
            } else {
                z = false;
            }
            if (i3 == 0) {
                if (!z) {
                    if (i3 != 0) {
                        i5 = 1;
                    } else {
                        i5 = 0;
                    }
                }
            } else if (!z) {
                if (i3 != 0) {
                    i5 = 1;
                } else {
                    i5 = 0;
                }
            }
            return new ylc(str2, new Integer(i5));
        }
        return hu4Var;
    }
}
