package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class dlk extends qkk implements ho7, io7 {
    public static final lkk k = glk.a;
    public final Context d;
    public final Handler e;
    public final lkk f;
    public final Set g;
    public final s80 h;
    public g4g i;
    public mkc j;

    public dlk(Context context, bmk bmkVar, s80 s80Var) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks", 0);
        this.d = context;
        this.e = bmkVar;
        this.h = s80Var;
        this.g = (Set) s80Var.a;
        this.f = k;
    }

    @Override // defpackage.io7
    public final void G(le4 le4Var) {
        this.j.f(le4Var);
    }

    @Override // defpackage.ho7
    public final void V(int i) {
        mkc mkcVar = this.j;
        skk skkVar = (skk) ((jo7) mkcVar.f).j.get((jp) mkcVar.c);
        if (skkVar != null) {
            if (skkVar.k) {
                skkVar.m(new le4(17, null, null));
            } else {
                skkVar.V(i);
            }
        }
    }

    @Override // defpackage.qkk
    public final boolean k0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 3:
                ykk.b(parcel);
                break;
            case 4:
                ykk.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                ykk.b(parcel);
                break;
            case 7:
                ykk.b(parcel);
                break;
            case 8:
                ulk ulkVar = (ulk) ykk.a(parcel, ulk.CREATOR);
                ykk.b(parcel);
                this.e.post(new txj(this, ulkVar, false, 2));
                break;
            case 9:
                ykk.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public final void n0(mkc mkcVar) {
        g4g g4gVar = this.i;
        if (g4gVar != null) {
            g4gVar.m();
        }
        Integer numValueOf = Integer.valueOf(System.identityHashCode(this));
        s80 s80Var = this.h;
        s80Var.f = numValueOf;
        Handler handler = this.e;
        this.i = (g4g) this.f.d(this.d, handler.getLooper(), s80Var, (h4g) s80Var.e, this, this);
        this.j = mkcVar;
        Set set = this.g;
        if (set == null || set.isEmpty()) {
            handler.post(new rda(25, this));
            return;
        }
        g4g g4gVar2 = this.i;
        g4gVar2.getClass();
        g4gVar2.g(new zo7(g4gVar2));
    }

    public final void o0() {
        g4g g4gVar = this.i;
        if (g4gVar != null) {
            g4gVar.m();
        }
    }

    @Override // defpackage.ho7
    public final void onConnected() {
        g4g g4gVar = this.i;
        g4gVar.getClass();
        try {
            g4gVar.z.getClass();
            Account account = new Account("<<default account>>", "com.google");
            GoogleSignInAccount googleSignInAccountB = "<<default account>>".equals(account.name) ? fqg.a(g4gVar.c).b() : null;
            Integer num = g4gVar.B;
            yab.s(num);
            amk amkVar = new amk(2, account, num.intValue(), googleSignInAccountB);
            klk klkVar = (klk) g4gVar.p();
            slk slkVar = new slk(1, amkVar);
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(klkVar.e);
            ykk.c(parcelObtain, slkVar);
            parcelObtain.writeStrongBinder(this);
            klkVar.G(12, parcelObtain);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.e.post(new txj(this, new ulk(1, new le4(8, null, null), null), false, 2));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
