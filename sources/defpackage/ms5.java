package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ms5 extends ar0 {
    public final /* synthetic */ int a;
    public final List b;

    public ms5(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = xw3.P0("flow", "connection_type");
                break;
            case 2:
                this.b = xw3.P0("size", "attach_type", "connection_type", "class");
                break;
            default:
                this.b = xw3.P0("attach_type", "connection_type", "size");
                break;
        }
    }

    @Override // defpackage.ar0
    public final List b() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
        }
        return this.b;
    }

    @Override // defpackage.ar0
    public final boolean c(b9b b9bVar, List list) {
        switch (this.a) {
            case 0:
                return (b9bVar.b("already_downloaded") ? 3 : 4) == list.size();
            case 1:
            default:
                return true;
        }
    }
}
