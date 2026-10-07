package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class rk8 implements o5j {
    public final pvb a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final String f = rk8.class.getName();
    public final List g = xw3.P0(720, 1080, 480, 360, 240, 144, 1440, 2160);

    public rk8(pvb pvbVar, long j, long j2, long j3, String str) {
        this.a = pvbVar;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = str;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Override // defpackage.o5j
    public final Object a(lq4 lq4Var) {
        qk8 qk8Var;
        je9 je9Var = je9.d;
        if (lq4Var instanceof qk8) {
            qk8Var = (qk8) lq4Var;
            int i = qk8Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                qk8Var.f = i - Integer.MIN_VALUE;
            } else {
                qk8Var = new qk8(this, (nq4) lq4Var);
            }
        } else {
            qk8Var = new qk8(this, (nq4) lq4Var);
        }
        Object objD = qk8Var.d;
        hu4 hu4Var = hu4.a;
        int i2 = qk8Var.f;
        if (i2 == 0) {
            ch3.d0(objD);
            String str = this.f;
            a4c a4cVar = gm0.f;
            if (a4cVar != null && a4cVar.b(je9Var)) {
                a4cVar.c(je9Var, str, ewi.d(this.b, "Fetch video. Internal fetcher, videoId:", ", token:", this.e), null);
            }
            pvb pvbVar = this.a;
            lrg lrgVar = new lrg(this.b, this.c, this.d, this.e);
            qk8Var.f = 1;
            objD = pvbVar.D(lrgVar, qk8Var);
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ch3.d0(objD);
        }
        a3j a3jVar = (a3j) objD;
        String str2 = this.f;
        a4c a4cVar2 = gm0.f;
        if (a4cVar2 != null && a4cVar2.b(je9Var)) {
            a4cVar2.c(je9Var, str2, "Fetch video. Internal fetcher, response:" + a3jVar, null);
        }
        c79 c79VarW = yab.w();
        String str3 = (String) a3jVar.c.get("DASH");
        if (str3 == null) {
            str3 = "";
        }
        if (str3.length() > 0) {
            c79VarW.add(new cp6(2, str3));
        }
        String str4 = (String) a3jVar.c.get("HLS");
        String str5 = str4 != null ? str4 : "";
        if (str5.length() > 0) {
            c79VarW.add(new cp6(1, str5));
        }
        c79VarW.addAll(yhf.w0(new m2i(new rj7(yhf.m0(new sw(1, a3jVar.c.entrySet()), new x27(13)), 1, new mu1(5, this)), new x27(14))));
        c79 c79VarJ = yab.j(c79VarW);
        if (c79VarJ.isEmpty()) {
            return null;
        }
        return new dp6(c79VarJ, a3jVar.f);
    }
}
