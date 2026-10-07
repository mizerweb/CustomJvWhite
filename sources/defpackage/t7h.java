package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class t7h extends pzf implements gjg {
    @Override // defpackage.gjg
    public final Object getValue() {
        Integer numValueOf;
        synchronized (this) {
            numValueOf = Integer.valueOf(((Number) e9i.c(this.h, (this.i + ((long) ((int) ((q() + ((long) this.k)) - this.i)))) - 1)).intValue());
        }
        return numValueOf;
    }

    public final void x(int i) {
        synchronized (this) {
            a(Integer.valueOf(((Number) e9i.c(this.h, (this.i + ((long) ((int) ((q() + ((long) this.k)) - this.i)))) - 1)).intValue() + i));
        }
    }
}
