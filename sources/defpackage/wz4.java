package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class wz4 extends yz4 {
    public static final wz4 c = new wz4("", 0);
    public static final wz4 d = new wz4("", 1);
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz4(Comparable comparable, int i) {
        super(comparable);
        this.b = i;
    }

    @Override // defpackage.yz4
    /* JADX INFO: renamed from: a */
    public int compareTo(yz4 yz4Var) {
        switch (this.b) {
            case 0:
                return yz4Var == this ? 0 : 1;
            case 1:
                return yz4Var == this ? 0 : -1;
            default:
                return super.compareTo(yz4Var);
        }
    }

    @Override // defpackage.yz4
    public final void b(StringBuilder sb) {
        switch (this.b) {
            case 0:
                throw new AssertionError();
            case 1:
                sb.append("(-∞");
                return;
            default:
                sb.append('[');
                sb.append(this.a);
                return;
        }
    }

    @Override // defpackage.yz4, java.lang.Comparable
    public int compareTo(Object obj) {
        switch (this.b) {
            case 0:
                return ((yz4) obj) == this ? 0 : 1;
            case 1:
                return ((yz4) obj) == this ? 0 : -1;
            default:
                return super.compareTo(obj);
        }
    }

    @Override // defpackage.yz4
    public final void d(StringBuilder sb) {
        switch (this.b) {
            case 0:
                sb.append("+∞)");
                return;
            case 1:
                throw new AssertionError();
            default:
                sb.append(this.a);
                sb.append(')');
                return;
        }
    }

    @Override // defpackage.yz4
    public Comparable h() {
        switch (this.b) {
            case 0:
                throw new IllegalStateException("range unbounded on this side");
            case 1:
                throw new IllegalStateException("range unbounded on this side");
            default:
                return super.h();
        }
    }

    @Override // defpackage.yz4
    public final int hashCode() {
        switch (this.b) {
            case 0:
                return System.identityHashCode(this);
            case 1:
                return System.identityHashCode(this);
            default:
                return this.a.hashCode();
        }
    }

    @Override // defpackage.yz4
    public final boolean i(Comparable comparable) {
        switch (this.b) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                int i = k4e.c;
                return this.a.compareTo(comparable) <= 0;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return "+∞";
            case 1:
                return "-∞";
            default:
                return "\\" + this.a + "/";
        }
    }
}
