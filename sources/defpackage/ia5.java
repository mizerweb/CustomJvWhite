package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class ia5 implements oah {
    public final /* synthetic */ int a;

    @Override // defpackage.oah
    public final Object get() {
        int i;
        switch (this.a) {
            case 0:
                int iMin = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
                if (iMin < 16777216) {
                    i = 1048576;
                } else {
                    i = iMin < 33554432 ? 2097152 : 4194304;
                }
                return new uaa(i, Integer.MAX_VALUE, i, i / 8);
            case 1:
                return Boolean.TRUE;
            default:
                return Boolean.FALSE;
        }
    }
}
