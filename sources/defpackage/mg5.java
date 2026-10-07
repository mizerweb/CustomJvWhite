package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum mg5 {
    REGULAR((byte) 0),
    DELAYED((byte) 1);

    public static final ku6 d = new ku6(17);
    public final byte a;
    public final ifh b;
    public final ifh c;

    mg5(byte b) {
        this.a = b;
        final int i = 0;
        this.b = new ifh(new af7(this) { // from class: lg5
            public final /* synthetic */ mg5 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i2 = i;
                mg5 mg5Var = this.b;
                switch (i2) {
                    case 0:
                        return Boolean.valueOf(mg5Var == mg5.REGULAR);
                    default:
                        return Boolean.valueOf(mg5Var == mg5.DELAYED);
                }
            }
        });
        final int i2 = 1;
        this.c = new ifh(new af7(this) { // from class: lg5
            public final /* synthetic */ mg5 b;

            {
                this.b = this;
            }

            @Override // defpackage.af7
            public final Object invoke() {
                int i3 = i2;
                mg5 mg5Var = this.b;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(mg5Var == mg5.REGULAR);
                    default:
                        return Boolean.valueOf(mg5Var == mg5.DELAYED);
                }
            }
        });
    }

    public final boolean a() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }

    public final boolean h() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }
}
