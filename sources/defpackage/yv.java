package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public final class yv extends l79 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yv(fif fifVar, int i) {
        super(fifVar);
        this.b = i;
    }

    @Override // defpackage.fif
    public final String i() {
        switch (this.b) {
            case 0:
                return "kotlin.Array";
            case 1:
                return "kotlin.collections.HashSet";
            default:
                return "kotlin.collections.LinkedHashSet";
        }
    }
}
