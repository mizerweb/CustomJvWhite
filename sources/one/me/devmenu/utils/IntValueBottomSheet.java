package one.me.devmenu.utils;

import android.os.Bundle;
import defpackage.j95;
import defpackage.n1g;
import defpackage.ylc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lone/me/devmenu/utils/IntValueBottomSheet;", "Lone/me/devmenu/utils/ValueBottomSheet;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "initialValue", "", "buttonId", "", "", "descriptions", "(IJ[Ljava/lang/String;)V", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class IntValueBottomSheet extends ValueBottomSheet {
    public final boolean A;

    public IntValueBottomSheet(int i, long j, String[] strArr) {
        this(n1g.i(new ylc("arg:value", Integer.valueOf(i)), new ylc("arg:button_id", Long.valueOf(j)), new ylc("arg:descriptions", strArr)));
    }

    @Override // one.me.devmenu.utils.ValueBottomSheet
    /* JADX INFO: renamed from: F1 */
    public final String getU() {
        return String.valueOf(getArgs().getInt("arg:value"));
    }

    @Override // one.me.devmenu.utils.ValueBottomSheet
    /* JADX INFO: renamed from: G1, reason: from getter */
    public final boolean getA() {
        return this.A;
    }

    public /* synthetic */ IntValueBottomSheet(int i, long j, String[] strArr, int i2, j95 j95Var) {
        this(i, j, (i2 & 4) != 0 ? new String[0] : strArr);
    }

    public IntValueBottomSheet(Bundle bundle) {
        super(bundle);
        this.A = true;
    }
}
