package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.ContactsContract;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class n30 {
    public final Context a;
    public final t51 b;
    public final xhh c;
    public final i5d d;
    public final ny8 f;
    public final ny8 g;
    public final pzf i;
    public i30 j;
    public final ku6 k;
    public final AtomicBoolean l;
    public final String e = n30.class.getName();
    public final CopyOnWriteArraySet h = new CopyOnWriteArraySet();

    public n30(Context context, ny8 ny8Var, ny8 ny8Var2, ny8 ny8Var3, t51 t51Var, xhh xhhVar, ite iteVar, i5d i5dVar) {
        this.a = context;
        this.b = t51Var;
        this.c = xhhVar;
        this.d = i5dVar;
        this.f = ny8Var;
        this.g = ny8Var2;
        pzf pzfVarB = e9i.b(0, 1, 1);
        this.i = pzfVarB;
        dq4 dq4VarD = cqk.D(iteVar, ((n0c) xhhVar).b().R0(1, "phonebook"));
        this.k = new ku6(22);
        this.l = new AtomicBoolean(false);
        c();
        fz6 fz6Var = new fz6(pzfVarB, new l3(2, null, 1));
        ghb ghbVar = ew5.b;
        e9i.j0(new dz6(new j3(new fz6(new l30(tre.G0(fz6Var, qe7.O(5, lw5.SECONDS)), ny8Var3, this, ny8Var2), new wyj(this, null, 1), 3), 3, this), new adh(this, (lq4) null, 4)), dq4VarD);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x015d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01a6, code lost:
    
        if (r0 == r8) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(defpackage.n30 r23, defpackage.nq4 r24) {
        /*
            Method dump skipped, instruction units count: 698
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n30.a(n30, nq4):java.lang.Object");
    }

    public final void b() {
        gm0.n(this.e, "call checkUpdates");
        this.i.a(sbi.a);
    }

    public final void c() {
        i30 i30Var;
        if (!((wsc) ((wwb) this.g.getValue()).a.getValue()).c(wsc.g)) {
            gm0.n(this.e, "subscribeOnSystemChanges: no permissions, return");
            return;
        }
        if (this.j == null) {
            try {
                i30Var = new i30(this, new Handler(Looper.getMainLooper()));
                this.a.getContentResolver().registerContentObserver(ContactsContract.Contacts.CONTENT_URI, true, i30Var);
            } catch (SecurityException unused) {
                String str = this.e;
                a4c a4cVar = gm0.f;
                if (a4cVar != null) {
                    je9 je9Var = je9.f;
                    if (a4cVar.b(je9Var)) {
                        a4cVar.c(je9Var, str, zo5.l(ContactsContract.Contacts.CONTENT_URI, "fail to registerContentObserver for ContactsContract.Contacts.CONTENT_URI="), null);
                    }
                }
                i30Var = null;
            }
            this.j = i30Var;
        }
    }
}
