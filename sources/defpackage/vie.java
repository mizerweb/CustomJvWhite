package defpackage;

import ru.ok.tamtam.nano.Tasks;

/* JADX INFO: loaded from: classes3.dex */
public final class vie extends aq implements qih, btc {
    public final long f;

    public vie(long j, long j2) {
        super(j);
        this.f = j2;
    }

    @Override // defpackage.qih, defpackage.btc
    public final boolean a() {
        return true;
    }

    @Override // defpackage.btc
    public final byte[] g() {
        Tasks.RemoveContactPhoto removeContactPhoto = new Tasks.RemoveContactPhoto();
        removeContactPhoto.requestId = this.a;
        removeContactPhoto.photoId = this.f;
        return sia.toByteArray(removeContactPhoto);
    }

    @Override // defpackage.btc
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.btc
    public final ctc getType() {
        return ctc.TYPE_REMOVE_CONTACT_PHOTO;
    }

    @Override // defpackage.btc
    public final Object h(nq4 nq4Var) {
        long jT = t().a.t();
        if (jT > 0) {
            n().r(jT);
        }
        Object objM = v().m(this.a, nq4Var);
        return objM == hu4.a ? objM : sbi.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.qih
    public final Object i(yhh yhhVar, nq4 nq4Var) {
        uie uieVar;
        if (nq4Var instanceof uie) {
            uieVar = (uie) nq4Var;
            int i = uieVar.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                uieVar.g = i - Integer.MIN_VALUE;
            } else {
                uieVar = new uie(this, nq4Var);
            }
        } else {
            uieVar = new uie(this, nq4Var);
        }
        Object obj = uieVar.e;
        int i2 = uieVar.g;
        if (i2 == 0) {
            ch3.d0(obj);
            if (!p90.C(yhhVar.b)) {
                uieVar.d = yhhVar;
                uieVar.g = 1;
                Object objH = h(uieVar);
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
            yhhVar = uieVar.d;
            ch3.d0(obj);
        }
        o().c(new yq0(this.a, yhhVar));
        return sbi.a;
    }

    @Override // defpackage.btc
    public final atc j() {
        return atc.a;
    }

    @Override // defpackage.qih
    public final Object k(kih kihVar, nq4 nq4Var) {
        wie wieVar = (wie) kihVar;
        xb9 xb9Var = t().a;
        xb9Var.q.B(xb9Var, s7f.j0[11], null);
        bq bqVar = this.e;
        if (bqVar == null) {
            bqVar = null;
        }
        Object objD = ((utd) bqVar.W.getValue()).d(wieVar.c, null, nq4Var);
        return objD == hu4.a ? objD : sbi.a;
    }

    @Override // defpackage.aq
    public final Object m() {
        return new h3b(this.f, 19, (byte) 0);
    }
}
