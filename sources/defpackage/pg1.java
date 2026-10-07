package defpackage;

import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
public final class pg1 implements sg1 {
    public final a80 a;
    public final tnh b;
    public final tnh c;

    public pg1(a80 a80Var) {
        this.a = a80Var;
        tnh tnhVar = new tnh(R.string.call_volume_speakerphone);
        this.b = tnhVar;
        this.c = tnhVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg1) && cqk.d(this.a, ((pg1) obj).a);
    }

    @Override // defpackage.sg1
    public final ynh getContentDescription() {
        return this.c;
    }

    @Override // defpackage.sg1
    public final int getIcon() {
        return R.drawable.ic_volume_speakerphone_25;
    }

    @Override // defpackage.sg1
    public final int getId() {
        return R.id.call_dynamic_type_speakerphone;
    }

    @Override // defpackage.sg1
    public final ynh getTitle() {
        return this.b;
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
        return R.drawable.ic_sound_on_fill_28;
    }

    public final String toString() {
        return "Speakerphone(device=" + this.a + ")";
    }
}
