package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class akd extends aq implements qih, btc {
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final r60 j;
    public final String k;
    public final String l;
    public final int m;

    public akd(long j, String str, String str2, String str3, long j2, r60 r60Var, String str4, String str5, int i) {
        super(j);
        this.f = str;
        this.g = str2;
        this.h = str3;
        this.i = j2;
        this.j = r60Var;
        this.k = str4;
        this.l = str5;
        this.m = i;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return true;
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.Profile profile = new Tasks.Profile();
        profile.requestId = this.a;
        profile.photoId = this.i;
        String str = this.f;
        if (str != null && str.length() != 0) {
            profile.firstName = str;
        }
        String str2 = this.g;
        if (str2 != null && str2.length() != 0) {
            profile.lastName = str2;
        }
        String str3 = this.h;
        if (str3 != null && str3.length() != 0) {
            profile.photoToken = str3;
        }
        String str4 = this.k;
        if (str4 != null && str4.length() != 0) {
            profile.description = str4;
        }
        String str5 = this.l;
        if (str5 != null && str5.length() != 0) {
            profile.link = str5;
        }
        int i = this.m;
        if (p.a(i).length() != 0) {
            profile.avatarType = p.a(i);
        }
        r60 r60Var = this.j;
        if (r60Var != null) {
            Tasks.Rect rect = new Tasks.Rect();
            rect.left = r60Var.b;
            rect.top = r60Var.c;
            rect.right = r60Var.d;
            rect.bottom = r60Var.e;
            profile.crop = rect;
        }
        return sia.toByteArray(profile);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_PROFILE;
    }

    @Override // defpackage.btc
    public final Object h(nq4 nq4Var) {
        Object objM = v().m(this.a, nq4Var);
        return objM == hu4.a ? objM : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qih
    public final Object i(yhh yhhVar, nq4 nq4Var) {
        yjd yjdVar;
        if (nq4Var instanceof yjd) {
            yjdVar = (yjd) nq4Var;
            int i = yjdVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                yjdVar.g = i - Integer.MIN_VALUE;
            } else {
                yjdVar = new yjd(this, nq4Var);
            }
        } else {
            yjdVar = new yjd(this, nq4Var);
        }
        Object obj = yjdVar.e;
        int i2 = yjdVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            if (!p90.C(yhhVar.b)) {
                yjdVar.d = yhhVar;
                yjdVar.g = 1;
                Object objH = h(yjdVar);
                Object obj2 = hu4.a;
                if (objH == obj2) {
                    return obj2;
                }
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            yhhVar = yjdVar.d;
            ch3.d0(obj);
        }
        o().c(new dpd(yhhVar));
        return sbi.a;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.aq
    public final Object m() {
        return new h3b(this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qih
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public final Object k(dmd dmdVar, nq4 nq4Var) {
        zjd zjdVar;
        if (nq4Var instanceof zjd) {
            zjdVar = (zjd) nq4Var;
            int i = zjdVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                zjdVar.g = i - Integer.MIN_VALUE;
            } else {
                zjdVar = new zjd(this, nq4Var);
            }
        } else {
            zjdVar = new zjd(this, nq4Var);
        }
        Object obj = zjdVar.e;
        int i2 = zjdVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            xb9 xb9Var = t().a;
            xb9Var.q.B(xb9Var, s7f.j0[11], null);
            bq bqVar = this.e;
            if (bqVar == null) {
                bqVar = null;
            }
            utd utdVar = (utd) bqVar.W.getValue();
            ujd ujdVar = dmdVar.c;
            zjdVar.d = dmdVar;
            zjdVar.g = 1;
            Object objD = utdVar.d(ujdVar, null, zjdVar);
            hu4 hu4Var = hu4.a;
            if (objD == hu4Var) {
                return hu4Var;
            }
        } else {
            if (i2 != 1) {
                ore.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dmdVar = zjdVar.d;
            ch3.d0(obj);
        }
        t51 t51VarO = o();
        pj4 pj4Var = dmdVar.c.a;
        long j = this.a;
        t51VarO.c(new hpd(j, pj4Var));
        long j2 = dmdVar.c.a.f;
        if (this.i != 0) {
            o().c(new dkd(j, j2));
        }
        return sbi.a;
    }
}
