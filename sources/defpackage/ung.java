package defpackage;

import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ung implements UnaryOperator {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ ung(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                return new sng(str, 2);
            case 1:
                return new fog(str, 1);
            default:
                return str;
        }
    }
}
