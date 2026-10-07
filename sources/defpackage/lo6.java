package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class lo6 implements no6 {
    public final cli a;

    public lo6(cli cliVar) {
        this.a = cliVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lo6) && this.a.equals(((lo6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.a + ')';
    }
}
