package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class a6e extends Enum {

    /* JADX INFO: renamed from: b */
    public static final a6e EMOJI;
    public static final /* synthetic */ a6e[] c;
    public static final /* synthetic */ ma6 d;
    public final int a;

    /* JADX INFO: renamed from: EF15 */
    a6e STICKER;

    static {
        a6e a6eVar = new a6e(0);
        EMOJI = a6eVar;
        a6e[] a6eVarArr = {a6eVar, new a6e(1)};
        c = a6eVarArr;
        d = new ma6(a6eVarArr);
    }

    public a6e(int i) {
        super(str, i);
        this.a = i;
    }

    public static final a6e a(int i) {
        return xml.d(i);
    }

    public static a6e valueOf(String str) {
        return (a6e) Enum.valueOf(a6e.class, str);
    }

    public static a6e[] values() {
        return (a6e[]) c.clone();
    }

    public final int h() {
        return this.a;
    }
}
