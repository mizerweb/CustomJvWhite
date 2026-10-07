package defpackage;

import one.me.android.MainActivity;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s6 extends cwd {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s6(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.b = i2;
    }

    @Override // defpackage.cwd, defpackage.xv8
    public final Object get() {
        switch (this.b) {
            case 0:
                return ((v6) this.receiver).a;
            default:
                MainActivity mainActivity = (MainActivity) this.receiver;
                int i = MainActivity.o1;
                return mainActivity.w();
        }
    }
}
