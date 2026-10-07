package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class uh5 implements qh5 {
    public final zvj d;
    public int f;
    public int g;
    public zvj a = null;
    public boolean b = false;
    public boolean c = false;
    public int e = 1;
    public int h = 1;
    public xl5 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public uh5(zvj zvjVar) {
        this.d = zvjVar;
    }

    @Override // defpackage.qh5
    public final void a(qh5 qh5Var) {
        ArrayList<uh5> arrayList = this.l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((uh5) it.next()).j) {
                return;
            }
        }
        this.c = true;
        zvj zvjVar = this.a;
        if (zvjVar != null) {
            zvjVar.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        uh5 uh5Var = null;
        int i = 0;
        for (uh5 uh5Var2 : arrayList) {
            if (!(uh5Var2 instanceof xl5)) {
                i++;
                uh5Var = uh5Var2;
            }
        }
        if (uh5Var != null && i == 1 && uh5Var.j) {
            xl5 xl5Var = this.i;
            if (xl5Var != null) {
                if (!xl5Var.j) {
                    return;
                } else {
                    this.f = this.h * xl5Var.g;
                }
            }
            d(uh5Var.g + this.f);
        }
        zvj zvjVar2 = this.a;
        if (zvjVar2 != null) {
            zvjVar2.a(this);
        }
    }

    public final void b(zvj zvjVar) {
        this.k.add(zvjVar);
        if (this.j) {
            zvjVar.a(zvjVar);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (qh5 qh5Var : this.k) {
            qh5Var.a(qh5Var);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.g0);
        sb.append(":");
        switch (this.e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
