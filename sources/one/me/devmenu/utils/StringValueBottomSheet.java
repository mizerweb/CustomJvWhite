package one.me.devmenu.utils;

import android.os.Bundle;
import defpackage.j95;
import defpackage.n1g;
import defpackage.ylc;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B)\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\n¢\u0006\u0004\b\u0004\u0010\f¨\u0006\r"}, d2 = {"Lone/me/devmenu/utils/StringValueBottomSheet;", "Lone/me/devmenu/utils/ValueBottomSheet;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "initialValue", "", "buttonId", "", "descriptions", "(Ljava/lang/String;J[Ljava/lang/String;)V", "dev-menu"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class StringValueBottomSheet extends ValueBottomSheet {
    public StringValueBottomSheet(String str, long j, String[] strArr) {
        this(n1g.i(new ylc("arg:value", str), new ylc("arg:button_id", Long.valueOf(j)), new ylc("arg:descriptions", strArr)));
    }

    @Override // one.me.devmenu.utils.ValueBottomSheet
    /* JADX INFO: renamed from: F1 */
    public final String getU() {
        String string = getArgs().getString("arg:value");
        return string == null ? "" : string;
    }

    public /* synthetic */ StringValueBottomSheet(String str, long j, String[] strArr, int i, j95 j95Var) {
        this(str, j, (i & 4) != 0 ? new String[0] : strArr);
    }

    public StringValueBottomSheet(Bundle bundle) {
        super(bundle);
    }
}
