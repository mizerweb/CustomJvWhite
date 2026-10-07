package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class du1 {
    public static final bpc u = new bpc("peerid");
    public yt1 a;
    public final n8b b;
    public final p8b c;
    public final ArrayList d;
    public final List e;
    public final HashMap f;
    public cu1 g;
    public boolean h;
    public float i;
    public idb j;
    public bpc k;
    public String l;
    public String m;
    public long n;
    public boolean o;
    public boolean p;
    public hi1 q;
    public List r;
    public int s;
    public boolean t;

    public du1(yt1 yt1Var, bpc bpcVar, n8b n8bVar, p8b p8bVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = Collections.unmodifiableList(arrayList);
        this.f = new HashMap();
        this.g = new cu1(Boolean.FALSE);
        this.i = 1.0f;
        this.j = idb.a;
        this.r = Collections.EMPTY_LIST;
        this.s = 0;
        this.t = false;
        this.a = yt1Var;
        f(bpcVar);
        this.b = n8bVar == null ? new n8b() : n8bVar;
        this.c = p8bVar == null ? new p8b() : p8bVar;
    }

    public final yt1 a() {
        return this.a;
    }

    public final boolean b() {
        bu1 bu1Var = bu1.b;
        List list = this.e;
        return list.contains(bu1Var) || list.contains(bu1.a);
    }

    public final boolean c() {
        return this.k != null;
    }

    public final boolean d() {
        return e() && this.p;
    }

    public final boolean e() {
        return this.c.e && this.o;
    }

    public final boolean equals(Object obj) {
        yt1 yt1Var;
        if (this == obj) {
            return true;
        }
        return obj != null && du1.class == obj.getClass() && (yt1Var = this.a) != null && yt1Var.equals(((du1) obj).a);
    }

    public final boolean f(bpc bpcVar) {
        if (bpcVar == null || TextUtils.isEmpty(bpcVar.a) || Objects.equals(this.k, bpcVar)) {
            return false;
        }
        if (this.k == null) {
            this.n = System.currentTimeMillis();
        }
        this.k = bpcVar;
        ylc ylcVar = (ylc) this.f.get(bpcVar);
        if (ylcVar == null) {
            return true;
        }
        this.m = (String) ylcVar.a;
        this.l = (String) ylcVar.b;
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallParticipant{");
        sb.append(this.a);
        if (this.k != null || !this.f.isEmpty()) {
            sb.append("|registered");
        }
        sb.append("|isOnHold = ");
        sb.append(this.t);
        bpc bpcVar = this.k;
        if (bpcVar != null) {
            sb.append("|accepted(");
            sb.append(bpcVar.a);
            sb.append(',');
            sb.append(this.m);
            sb.append('/');
            sb.append(this.l);
            sb.append(')');
        }
        if (this.h) {
            sb.append("|connected");
        }
        sb.append('|');
        sb.append(this.c);
        sb.append('}');
        return sb.toString();
    }
}
