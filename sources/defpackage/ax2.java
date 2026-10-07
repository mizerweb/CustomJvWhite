package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ax2 {
    public final /* synthetic */ int a = 0;
    public boolean b;
    public int c;
    public long d;
    public boolean e;
    public List f;

    public ax2(ax2 ax2Var) {
        this.b = ax2Var.b;
        this.c = ax2Var.c;
        this.d = ax2Var.d;
        this.e = ax2Var.e;
        this.f = ax2Var.f;
    }

    public ax2 a() {
        return new ax2(this);
    }

    public int b() {
        return this.c;
    }

    public List c() {
        return this.f;
    }

    public long d() {
        return this.d;
    }

    public boolean e() {
        return this.b;
    }

    public boolean f() {
        return this.e;
    }

    public void g(int i) {
        this.c = i;
    }

    public void h(boolean z) {
        this.e = z;
    }

    public void i(boolean z) {
        this.b = z;
    }

    public void j(List list) {
        this.f = list;
    }

    public void k(long j) {
        this.d = j;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sbC = nbh.C("ChatReactionsSettings{isActive=");
                sbC.append(this.b);
                sbC.append(",count=");
                sbC.append(this.c);
                sbC.append(",updateTime=");
                sbC.append(this.d);
                sbC.append(",included=");
                sbC.append(this.e);
                if (this.f != null) {
                    sbC.append(",reactionIds=");
                    ww3.x1(this.f, sbC, ",", "[", "]", -1, "", new xk1(18));
                }
                sbC.append('}');
                return sbC.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ax2(boolean z) {
    }

    public ax2() {
    }
}
