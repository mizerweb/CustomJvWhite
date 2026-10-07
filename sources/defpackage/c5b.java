package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class c5b {
    public final /* synthetic */ int a;
    public final String b;

    public c5b(String str, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = str;
                break;
            default:
                this.b = str.concat("_");
                break;
        }
    }

    public String a(Object obj) {
        String string = obj.toString();
        if (string != null && string.length() != 0) {
            int length = string.length();
            int iCharCount = 0;
            while (iCharCount < length) {
                int iCodePointAt = string.codePointAt(iCharCount);
                if (Character.isLetterOrDigit(iCodePointAt)) {
                    iCharCount += Character.charCount(iCodePointAt);
                }
            }
            return this.b + obj;
        }
        ore.p(qv1.k("Invalid key: ", string));
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return x05.i(new StringBuilder("<"), this.b, '>');
            default:
                return super.toString();
        }
    }
}
