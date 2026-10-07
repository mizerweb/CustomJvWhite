package defpackage;

import java.io.File;
import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class ar2 extends mjf implements btc {
    public final long b;
    public final String c;
    public final long d;
    public final r60 e;
    public final long f;
    public final String g;
    public final wo8 h;
    public final ifh i;

    /* JADX WARN: Illegal instructions before constructor call */
    public ar2(long j, String str, long j2, r60 r60Var) {
        Object poeVar;
        try {
            poeVar = Long.valueOf(new File(str).lastModified());
        } catch (Throwable th) {
            poeVar = new poe(th);
        }
        this(j, str, j2, r60Var, ((Number) (poeVar instanceof poe ? 0L : poeVar)).longValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r9.D(r2) == r7) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object C(defpackage.ar2 r9, java.lang.Throwable r10, defpackage.nq4 r11) {
        /*
            long r0 = r9.b
            boolean r2 = r11 instanceof defpackage.yq2
            if (r2 == 0) goto L15
            r2 = r11
            yq2 r2 = (defpackage.yq2) r2
            int r3 = r2.g
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L15
            int r3 = r3 - r4
            r2.g = r3
            goto L1a
        L15:
            yq2 r2 = new yq2
            r2.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r2.e
            int r3 = r2.g
            r4 = 0
            r5 = 2
            r6 = 1
            hu4 r7 = defpackage.hu4.a
            if (r3 == 0) goto L3b
            if (r3 == r6) goto L35
            if (r3 != r5) goto L2f
            java.lang.Throwable r10 = r2.d
            defpackage.ch3.d0(r11)
            goto L64
        L2f:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ore.k(r9)
            return r4
        L35:
            java.lang.Throwable r10 = r2.d
            defpackage.ch3.d0(r11)
            goto L59
        L3b:
            defpackage.ch3.d0(r11)
            java.lang.String r11 = r9.g
            one.me.sdk.tasks.service.ChangeChatPhotoServiceTask$ChangeChatPhotoException r3 = new one.me.sdk.tasks.service.ChangeChatPhotoServiceTask$ChangeChatPhotoException
            r3.<init>(r10)
            java.lang.String r8 = "onUploadFailed: failed"
            defpackage.gm0.V(r11, r8, r3)
            okh r11 = r9.v()
            r2.d = r10
            r2.g = r6
            java.lang.Object r11 = r11.m(r0, r2)
            if (r11 != r7) goto L59
            goto L63
        L59:
            r2.d = r10
            r2.g = r5
            java.lang.Object r11 = r9.D(r2)
            if (r11 != r7) goto L64
        L63:
            return r7
        L64:
            boolean r11 = r10 instanceof ru.ok.tamtam.errors.TamErrorException
            if (r11 == 0) goto L6d
            ru.ok.tamtam.errors.TamErrorException r10 = (ru.ok.tamtam.errors.TamErrorException) r10
            yhh r10 = r10.a
            goto L79
        L6d:
            yhh r11 = new yhh
            java.lang.String r2 = "internal-error"
            java.lang.String r10 = r10.toString()
            r11.<init>(r2, r10, r4)
            r10 = r11
        L79:
            t51 r9 = r9.w()
            yq0 r11 = new yq0
            r11.<init>(r0, r10)
            r9.c(r11)
            sbi r9 = defpackage.sbi.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar2.C(ar2, java.lang.Throwable, nq4):java.lang.Object");
    }

    @Override // defpackage.mjf
    public final void A() {
        vd7.g(this.h);
    }

    @Override // defpackage.mjf
    public final void B() {
        String str = this.c;
        ahi ahiVar = new ahi(str == null ? "" : str, this.f, oji.PROFILE_PHOTO, "");
        vd7.g(this.h);
        njf njfVar = this.a;
        lq4 lq4Var = null;
        if (njfVar == null) {
            njfVar = null;
        }
        zgi zgiVar = (zgi) njfVar.R.getValue();
        zgiVar.getClass();
        e9i.j0(new j3(new fz6(e9i.r(new h30(zgiVar, ahiVar, lq4Var, lq4Var, 4)), new m20(2, this, ar2.class, "onUploadProgress", "onUploadProgress(Lone/me/sdk/transfer/domain/Upload;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3), 3), 14, new np2(this, lq4Var, 1)), (gu4) this.i.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object D(nq4 nq4Var) {
        zq2 zq2Var;
        if (nq4Var instanceof zq2) {
            zq2Var = (zq2) nq4Var;
            int i = zq2Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                zq2Var.f = i - Integer.MIN_VALUE;
            } else {
                zq2Var = new zq2(this, nq4Var);
            }
        } else {
            zq2Var = new zq2(this, nq4Var);
        }
        zq2 zq2Var2 = zq2Var;
        Object obj = zq2Var2.d;
        int i2 = zq2Var2.f;
        if (i2 == 0) {
            ch3.d0(obj);
            long j = this.d;
            if (j != 0) {
                rt2 rt2VarN = c().N(j);
                if (rt2VarN != null) {
                    c().Z(j, uw2.b);
                    b().f(rt2VarN.b.a);
                }
            } else {
                njf njfVar = this.a;
                dr2 dr2Var = (dr2) (njfVar != null ? njfVar : null).W.getValue();
                zq2Var2.f = 1;
                Comparable comparableA = dr2Var.a(0L, zq2Var2, null, null);
                hu4 hu4Var = hu4.a;
                if (comparableA == hu4Var) {
                    return hu4Var;
                }
            }
            return sbi.a;
        }
        if (i2 != 1) {
            ore.k("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ch3.d0(obj);
        long jT = ((s7f) m()).t();
        if (jT > 0) {
            b().r(jT);
        }
        return sbi.a;
    }

    @Override // defpackage.btc
    public final void d() {
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.ChangeProfileOrChatPhoto changeProfileOrChatPhoto = new Tasks.ChangeProfileOrChatPhoto();
        changeProfileOrChatPhoto.requestId = this.b;
        String str = this.c;
        if (str == null) {
            str = "";
        }
        changeProfileOrChatPhoto.file = str;
        changeProfileOrChatPhoto.chatId = this.d;
        r60 r60Var = this.e;
        if (r60Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = r60Var.b;
            rect.top = r60Var.c;
            rect.right = r60Var.d;
            rect.bottom = r60Var.e;
            changeProfileOrChatPhoto.crop = rect;
        }
        changeProfileOrChatPhoto.lastModified = this.f;
        return sia.toByteArray(changeProfileOrChatPhoto);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_CHANGE_PROFILE_OR_CHAT_PHOTO;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.btc
    public final int l() {
        return 1;
    }

    public ar2(long j, String str, long j2, r60 r60Var, long j3) {
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = r60Var;
        this.f = j3;
        this.g = ar2.class.getName();
        this.h = vd7.a();
        this.i = new ifh(new yk1(23, this));
    }
}
