package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class ng1 implements sg1 {
    public final a80 a;
    public final int b;
    public final ynh c;
    public final ynh d;

    public ng1(a80 a80Var) {
        this.a = a80Var;
        this.b = a80Var.c.hashCode();
        String str = a80Var.b;
        ynh tnhVar = r5h.X0(str) ? new tnh(R.string.call_volume_bluetooth_device) : new xnh(str);
        this.c = tnhVar;
        this.d = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng1) && cqk.d(this.a, ((ng1) obj).a);
    }

    @Override // defpackage.sg1
    public final ynh getContentDescription() {
        return this.d;
    }

    @Override // defpackage.sg1
    public final int getIcon() {
        return R.drawable.icon_bluetooth;
    }

    @Override // defpackage.sg1
    public final int getId() {
        return this.b;
    }

    @Override // defpackage.sg1
    public final ynh getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.sg1
    public final a80 n() {
        return this.a;
    }

    @Override // defpackage.sg1
    public final int o() {
        return R.drawable.icon_bluetooth_fill;
    }

    public final String toString() {
        return "Bluetooth(device=" + this.a + ")";
    }
}
