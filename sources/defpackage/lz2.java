package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class lz2 {
    public final ny8 a;
    public final ny8 b;

    public lz2(ny8 ny8Var, ny8 ny8Var2) {
        this.a = ny8Var;
        this.b = ny8Var2;
    }

    public final void a(int i, float f) {
        float f2;
        if (((f5d) ((wo6) ((rrc) this.a.getValue()).d.getValue())).c().b("ch_history")) {
            yj5 yj5Var = (yj5) this.b.getValue();
            switch (i) {
                case 1:
                    f2 = 1.0f;
                    break;
                case 2:
                    f2 = 2.0f;
                    break;
                case 3:
                    f2 = 3.0f;
                    break;
                case 4:
                    f2 = 4.0f;
                    break;
                case 5:
                    f2 = 5.0f;
                    break;
                case 6:
                    f2 = 6.0f;
                    break;
                case 7:
                    f2 = 7.0f;
                    break;
                case 8:
                    f2 = 8.0f;
                    break;
                case 9:
                    f2 = 9.0f;
                    break;
                case 10:
                    f2 = 10.0f;
                    break;
                default:
                    throw null;
            }
            yj5.a(yj5Var, xj5.CHAT_HISTORY_WARM, f2, f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, null, null, null, null, null, -8);
        }
    }
}
