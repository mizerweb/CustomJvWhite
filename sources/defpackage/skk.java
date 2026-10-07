package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.UnsupportedApiCallException;
import com.google.android.gms.common.internal.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class skk implements ho7, io7 {
    public final fo d;
    public final jp e;
    public final fbc f;
    public final int i;
    public final dlk j;
    public boolean k;
    public final /* synthetic */ jo7 o;
    public final LinkedList c = new LinkedList();
    public final HashSet g = new HashSet();
    public final HashMap h = new HashMap();
    public final ArrayList l = new ArrayList();
    public le4 m = null;
    public int n = 0;

    public skk(jo7 jo7Var, eo7 eo7Var) {
        this.o = jo7Var;
        Looper looper = jo7Var.m.getLooper();
        ki3 ki3VarA = eo7Var.a();
        s80 s80Var = new s80((String) ki3VarA.a, (String) ki3VarA.c, (pw) ki3VarA.b);
        f55 f55Var = (f55) eo7Var.c.b;
        yab.s(f55Var);
        fo foVarD = f55Var.d(eo7Var.a, looper, s80Var, eo7Var.d, this, this);
        String str = eo7Var.b;
        if (str != null && (foVarD instanceof a)) {
            ((a) foVarD).r = str;
        }
        if (str != null && (foVarD instanceof eib)) {
            qt4.A(foVarD);
            throw null;
        }
        this.d = foVarD;
        this.e = eo7Var.e;
        this.f = new fbc(27);
        this.i = eo7Var.g;
        if (!foVarD.d()) {
            this.j = null;
            return;
        }
        Context context = jo7Var.e;
        bmk bmkVar = jo7Var.m;
        ki3 ki3VarA2 = eo7Var.a();
        this.j = new dlk(context, bmkVar, new s80((String) ki3VarA2.a, (String) ki3VarA2.c, (pw) ki3VarA2.b));
    }

    @Override // defpackage.io7
    public final void G(le4 le4Var) {
        l(le4Var, null);
    }

    @Override // defpackage.ho7
    public final void V(int i) {
        Looper looperMyLooper = Looper.myLooper();
        bmk bmkVar = this.o.m;
        if (looperMyLooper == bmkVar.getLooper()) {
            f(i);
        } else {
            bmkVar.post(new v72(this, i, 4));
        }
    }

    public final void a(le4 le4Var) {
        HashSet hashSet = this.g;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
        } else if (it.next() != null) {
            ore.m();
        } else {
            if (f55.h(le4Var, le4.f)) {
                this.d.c();
            }
            throw null;
        }
    }

    public final void b(Status status) {
        yab.o(this.o.m);
        c(status, null, false);
    }

    public final void c(Status status, Exception exc, boolean z) {
        yab.o(this.o.m);
        if ((status == null) == (exc == null)) {
            ore.p("Status XOR exception should be null");
            return;
        }
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            tlk tlkVar = (tlk) it.next();
            if (!z || tlkVar.a == 2) {
                if (status != null) {
                    tlkVar.a(status);
                } else {
                    tlkVar.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void d() {
        LinkedList linkedList = this.c;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            tlk tlkVar = (tlk) arrayList.get(i);
            if (!this.d.isConnected()) {
                return;
            }
            if (h(tlkVar)) {
                linkedList.remove(tlkVar);
            }
        }
    }

    public final void e() {
        jo7 jo7Var = this.o;
        yab.o(jo7Var.m);
        this.m = null;
        a(le4.f);
        bmk bmkVar = jo7Var.m;
        if (this.k) {
            jp jpVar = this.e;
            bmkVar.removeMessages(11, jpVar);
            bmkVar.removeMessages(9, jpVar);
            this.k = false;
        }
        Iterator it = this.h.values().iterator();
        if (it.hasNext()) {
            throw null;
        }
        d();
        g();
    }

    public final void f(int i) {
        jo7 jo7Var = this.o;
        bmk bmkVar = jo7Var.m;
        yab.o(jo7Var.m);
        this.m = null;
        this.k = true;
        String strK = this.d.k();
        fbc fbcVar = this.f;
        fbcVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (strK != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(strK);
        }
        fbcVar.F(true, new Status(20, sb.toString(), null, null));
        jp jpVar = this.e;
        bmkVar.sendMessageDelayed(Message.obtain(bmkVar, 9, jpVar), 5000L);
        bmkVar.sendMessageDelayed(Message.obtain(bmkVar, 11, jpVar), 120000L);
        ((SparseIntArray) jo7Var.g.b).clear();
        Iterator it = this.h.values().iterator();
        while (it.hasNext()) {
            ((clk) it.next()).getClass();
        }
    }

    public final void g() {
        jo7 jo7Var = this.o;
        bmk bmkVar = jo7Var.m;
        jp jpVar = this.e;
        bmkVar.removeMessages(12, jpVar);
        bmkVar.sendMessageDelayed(bmkVar.obtainMessage(12, jpVar), jo7Var.a);
    }

    public final boolean h(tlk tlkVar) {
        do6 do6Var;
        if (!(tlkVar instanceof vkk)) {
            fbc fbcVar = this.f;
            fo foVar = this.d;
            tlkVar.d(fbcVar, foVar.d());
            try {
                tlkVar.c(this);
                return true;
            } catch (DeadObjectException unused) {
                V(1);
                foVar.a("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        vkk vkkVar = (vkk) tlkVar;
        do6[] do6VarArrG = vkkVar.g(this);
        if (do6VarArrG == null || do6VarArrG.length == 0) {
            do6Var = null;
            break;
        }
        do6[] do6VarArrJ = this.d.j();
        if (do6VarArrJ == null) {
            do6VarArrJ = new do6[0];
        }
        mw mwVar = new mw(do6VarArrJ.length);
        for (do6 do6Var2 : do6VarArrJ) {
            mwVar.put(do6Var2.a, Long.valueOf(do6Var2.b()));
        }
        int length = do6VarArrG.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                do6Var = null;
                break;
            }
            do6Var = do6VarArrG[i];
            Long l = (Long) mwVar.get(do6Var.a);
            if (l == null || l.longValue() < do6Var.b()) {
                break;
            }
            i++;
        }
        if (do6Var == null) {
            fbc fbcVar2 = this.f;
            fo foVar2 = this.d;
            tlkVar.d(fbcVar2, foVar2.d());
            try {
                tlkVar.c(this);
                return true;
            } catch (DeadObjectException unused2) {
                V(1);
                foVar2.a("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        Log.w("GoogleApiManager", this.d.getClass().getName() + " could not execute call because it requires feature (" + do6Var.a + ", " + do6Var.b() + ").");
        if (!this.o.n || !vkkVar.f(this)) {
            vkkVar.b(new UnsupportedApiCallException(do6Var));
            return true;
        }
        tkk tkkVar = new tkk(this.e, do6Var);
        int iIndexOf = this.l.indexOf(tkkVar);
        ArrayList arrayList = this.l;
        if (iIndexOf >= 0) {
            tkk tkkVar2 = (tkk) arrayList.get(iIndexOf);
            this.o.m.removeMessages(15, tkkVar2);
            bmk bmkVar = this.o.m;
            bmkVar.sendMessageDelayed(Message.obtain(bmkVar, 15, tkkVar2), 5000L);
        } else {
            arrayList.add(tkkVar);
            bmk bmkVar2 = this.o.m;
            bmkVar2.sendMessageDelayed(Message.obtain(bmkVar2, 15, tkkVar), 5000L);
            bmk bmkVar3 = this.o.m;
            bmkVar3.sendMessageDelayed(Message.obtain(bmkVar3, 16, tkkVar), 120000L);
            le4 le4Var = new le4(2, null, null);
            if (!i(le4Var)) {
                this.o.b(le4Var, this.i);
            }
        }
        return false;
    }

    public final boolean i(le4 le4Var) {
        synchronized (jo7.q) {
        }
        return false;
    }

    public final void j() {
        jo7 jo7Var = this.o;
        yab.o(jo7Var.m);
        fo foVar = this.d;
        if (foVar.isConnected() || foVar.b()) {
            return;
        }
        try {
            fbc fbcVar = jo7Var.g;
            Context context = jo7Var.e;
            SparseIntArray sparseIntArray = (SparseIntArray) fbcVar.b;
            yab.s(context);
            int i = foVar.i();
            int iC = ((SparseIntArray) fbcVar.b).get(i, -1);
            if (iC == -1) {
                iC = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= sparseIntArray.size()) {
                        iC = -1;
                        break;
                    }
                    int iKeyAt = sparseIntArray.keyAt(i2);
                    if (iKeyAt > i && sparseIntArray.get(iKeyAt) == 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (iC == -1) {
                    iC = ((fo7) fbcVar.c).c(context, i);
                }
                sparseIntArray.put(i, iC);
            }
            if (iC == 0) {
                mkc mkcVar = new mkc(jo7Var, foVar, this.e);
                if (foVar.d()) {
                    dlk dlkVar = this.j;
                    yab.s(dlkVar);
                    dlkVar.n0(mkcVar);
                }
                try {
                    foVar.g(mkcVar);
                    return;
                } catch (SecurityException e) {
                    l(new le4(10, null, null), e);
                    return;
                }
            }
            le4 le4Var = new le4(iC, null, null);
            Log.w("GoogleApiManager", "The service for " + foVar.getClass().getName() + " is not available: " + le4Var.toString());
            l(le4Var, null);
        } catch (IllegalStateException e2) {
            l(new le4(10, null, null), e2);
        }
    }

    public final void k(tlk tlkVar) {
        yab.o(this.o.m);
        boolean zIsConnected = this.d.isConnected();
        LinkedList linkedList = this.c;
        if (zIsConnected) {
            if (h(tlkVar)) {
                g();
                return;
            } else {
                linkedList.add(tlkVar);
                return;
            }
        }
        linkedList.add(tlkVar);
        le4 le4Var = this.m;
        if (le4Var == null || le4Var.b == 0 || le4Var.c == null) {
            j();
        } else {
            l(le4Var, null);
        }
    }

    public final void l(le4 le4Var, RuntimeException runtimeException) {
        yab.o(this.o.m);
        dlk dlkVar = this.j;
        if (dlkVar != null) {
            dlkVar.o0();
        }
        yab.o(this.o.m);
        this.m = null;
        ((SparseIntArray) this.o.g.b).clear();
        a(le4Var);
        if ((this.d instanceof xlk) && le4Var.b != 24) {
            jo7 jo7Var = this.o;
            jo7Var.b = true;
            bmk bmkVar = jo7Var.m;
            bmkVar.sendMessageDelayed(bmkVar.obtainMessage(19), 300000L);
        }
        if (le4Var.b == 4) {
            b(jo7.p);
            return;
        }
        if (this.c.isEmpty()) {
            this.m = le4Var;
            return;
        }
        jo7 jo7Var2 = this.o;
        if (runtimeException != null) {
            yab.o(jo7Var2.m);
            c(null, runtimeException, false);
            return;
        }
        boolean z = jo7Var2.n;
        jp jpVar = this.e;
        if (!z) {
            b(jo7.c(jpVar, le4Var));
            return;
        }
        c(jo7.c(jpVar, le4Var), null, true);
        if (this.c.isEmpty() || i(le4Var) || this.o.b(le4Var, this.i)) {
            return;
        }
        if (le4Var.b == 18) {
            this.k = true;
        }
        if (!this.k) {
            b(jo7.c(this.e, le4Var));
            return;
        }
        jo7 jo7Var3 = this.o;
        jp jpVar2 = this.e;
        bmk bmkVar2 = jo7Var3.m;
        bmkVar2.sendMessageDelayed(Message.obtain(bmkVar2, 9, jpVar2), 5000L);
    }

    public final void m(le4 le4Var) {
        yab.o(this.o.m);
        fo foVar = this.d;
        foVar.a("onSignInFailed for " + foVar.getClass().getName() + " with " + String.valueOf(le4Var));
        l(le4Var, null);
    }

    public final void n() {
        yab.o(this.o.m);
        Status status = jo7.o;
        b(status);
        this.f.F(false, status);
        for (p89 p89Var : (p89[]) this.h.keySet().toArray(new p89[0])) {
            k(new qlk(null, new qjh()));
        }
        a(new le4(4, null, null));
        fo foVar = this.d;
        if (foVar.isConnected()) {
            foVar.h(new rai(this));
        }
    }

    @Override // defpackage.ho7
    public final void onConnected() {
        Looper looperMyLooper = Looper.myLooper();
        bmk bmkVar = this.o.m;
        if (looperMyLooper == bmkVar.getLooper()) {
            e();
        } else {
            bmkVar.post(new rda(23, this));
        }
    }
}
