package defpackage;

import one.me.sdk.tasks.service.ChangeChatPhotoServiceTask$ChangeChatPhotoException;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class op2 extends mjf implements btc {
    public final long b;
    public final String c;
    public final long d;
    public final r60 e;
    public final long f;
    public final String g = op2.class.getName();
    public final wo8 h = vd7.a();
    public final ifh i = new ifh(new yk1(22, this));

    public op2(long j, String str, long j2, r60 r60Var, long j3) {
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = r60Var;
        this.f = j3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
    
        if (r9.m(r0, r2) == r6) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(defpackage.op2 r9, defpackage.dg3 r10, defpackage.nq4 r11) {
        /*
            long r0 = r9.b
            boolean r2 = r11 instanceof defpackage.kp2
            if (r2 == 0) goto L15
            r2 = r11
            kp2 r2 = (defpackage.kp2) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.f = r3
            goto L1a
        L15:
            kp2 r2 = new kp2
            r2.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r2.d
            int r3 = r2.f
            r4 = 2
            r5 = 1
            hu4 r6 = defpackage.hu4.a
            if (r3 == 0) goto L37
            if (r3 == r5) goto L33
            if (r3 != r4) goto L2c
            defpackage.ch3.d0(r11)
            goto L75
        L2c:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            r9 = 0
            return r9
        L33:
            defpackage.ch3.d0(r11)
            goto L5c
        L37:
            defpackage.ch3.d0(r11)
            st2 r11 = r10.c
            if (r11 == 0) goto L5c
            qw2 r11 = r9.c()
            long r7 = r9.d
            uw2 r3 = defpackage.uw2.b
            r11.Z(r7, r3)
            xn3 r11 = r9.k()
            st2 r10 = r10.c
            java.util.List r10 = java.util.Collections.singletonList(r10)
            r2.f = r5
            java.lang.Object r10 = r11.w(r10, r2)
            if (r10 != r6) goto L5c
            goto L74
        L5c:
            t51 r10 = r9.w()
            eg3 r11 = new eg3
            r11.<init>(r0)
            r10.c(r11)
            okh r9 = r9.v()
            r2.f = r4
            java.lang.Object r9 = r9.m(r0, r2)
            if (r9 != r6) goto L75
        L74:
            return r6
        L75:
            sbi r9 = defpackage.sbi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.op2.C(op2, dg3, nq4):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object D(op2 op2Var, Throwable th, nq4 nq4Var) {
        lp2 lp2Var;
        long j = op2Var.b;
        if (nq4Var instanceof lp2) {
            lp2Var = (lp2) nq4Var;
            int i = lp2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                lp2Var.g = i - Integer.MIN_VALUE;
            } else {
                lp2Var = new lp2(op2Var, nq4Var);
            }
        } else {
            lp2Var = new lp2(op2Var, nq4Var);
        }
        Object obj = lp2Var.e;
        int i2 = lp2Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.V(op2Var.g, "onChatUpdateError: failed", new ChangeChatPhotoServiceTask$ChangeChatPhotoException(th));
            okh okhVarV = op2Var.v();
            lp2Var.d = th;
            lp2Var.g = 1;
            Object objM = okhVarV.m(j, lp2Var);
            hu4 hu4Var = hu4.a;
            if (objM == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            th = lp2Var.d;
            ch3.d0(obj);
        }
        op2Var.G();
        op2Var.F();
        op2Var.w().c(new yq0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new yhh("internal-error", th.toString(), null)));
        return sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object E(op2 op2Var, Throwable th, nq4 nq4Var) {
        mp2 mp2Var;
        long j = op2Var.b;
        if (nq4Var instanceof mp2) {
            mp2Var = (mp2) nq4Var;
            int i = mp2Var.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                mp2Var.g = i - Integer.MIN_VALUE;
            } else {
                mp2Var = new mp2(op2Var, nq4Var);
            }
        } else {
            mp2Var = new mp2(op2Var, nq4Var);
        }
        Object obj = mp2Var.e;
        int i2 = mp2Var.g;
        if (i2 == 0) {
            ch3.d0(obj);
            gm0.V(op2Var.g, "onUploadFailed: failed", new ChangeChatPhotoServiceTask$ChangeChatPhotoException(th));
            okh okhVarV = op2Var.v();
            mp2Var.d = th;
            mp2Var.g = 1;
            Object objM = okhVarV.m(j, mp2Var);
            hu4 hu4Var = hu4.a;
            if (objM == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            th = mp2Var.d;
            ch3.d0(obj);
        }
        op2Var.G();
        op2Var.F();
        op2Var.w().c(new yq0(j, th instanceof TamErrorException ? ((TamErrorException) th).a : new yhh("internal-error", th.toString(), null)));
        return sbi.a;
    }

    @Override // defpackage.mjf
    public final void A() {
        F();
    }

    @Override // defpackage.mjf
    public final void B() {
        String str = this.c;
        ahi ahiVar = new ahi(str == null ? "" : str, this.f, oji.PROFILE_PHOTO, "");
        F();
        njf njfVar = this.a;
        if (njfVar == null) {
            njfVar = null;
        }
        zgi zgiVar = (zgi) njfVar.R.getValue();
        zgiVar.getClass();
        e9i.j0(new j3(new fz6(e9i.r(new h30(zgiVar, ahiVar, (Object) null, (lq4) null, 4)), new w8(2, this, op2.class, "onUploadProgress", "onUploadProgress(Lone/me/sdk/transfer/domain/Upload;)V", 4, 6), 3), 14, new np2(this, (lq4) null, 0)), (gu4) this.i.getValue());
    }

    public final void F() {
        vd7.g(this.h);
    }

    public final void G() {
        qw2 qw2VarC = c();
        long j = this.d;
        rt2 rt2VarN = qw2VarC.N(j);
        if (rt2VarN != null) {
            c().Z(j, uw2.b);
            b().f(rt2VarN.b.a);
        }
    }

    @Override // defpackage.btc
    public final void d() {
        v().d(this.b);
        F();
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChangeChatPhoto changeChatPhoto = new Tasks.ChangeChatPhoto();
        changeChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeChatPhoto.file = str;
        changeChatPhoto.chatId = this.d;
        r60 r60Var = this.e;
        if (r60Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = r60Var.b;
            rect.top = r60Var.c;
            rect.right = r60Var.d;
            rect.bottom = r60Var.e;
            changeChatPhoto.crop = rect;
        }
        changeChatPhoto.lastModified = this.f;
        return sia.toByteArray(changeChatPhoto);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHANGE_CHAT_PHOTO;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }
}
