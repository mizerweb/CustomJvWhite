package one.me.common.drawable;

import android.graphics.drawable.Drawable;
import defpackage.at0;
import defpackage.hz0;
import defpackage.xs0;
import defpackage.zs0;
import kotlin.Metadata;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u00020\u00068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\bR\u001a\u0010\u000e\u001a\u00020\r8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lone/me/common/drawable/BlockedGhostAvatarDrawable;", "Lat0;", "<init>", "()V", "onMutate", "()Lat0;", "", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "iconResId", "I", "getIconResId", "Lzs0;", "backgroundSpec", "Lzs0;", "getBackgroundSpec", "()Lzs0;", "Companion", "hz0", "common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BlockedGhostAvatarDrawable extends at0 {

    @Deprecated
    public static final int BACKGROUND_COLOR = -4407873;
    private static final hz0 Companion = new hz0();
    private final int iconResId = R.drawable.ghost_icon;
    private final zs0 backgroundSpec = new xs0(BACKGROUND_COLOR);

    @Override // defpackage.at0
    public zs0 getBackgroundSpec() {
        return this.backgroundSpec;
    }

    @Override // defpackage.at0
    public int getIconResId() {
        return this.iconResId;
    }

    @Override // defpackage.at0, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable iconDrawable = getIconDrawable();
        return iconDrawable != null ? iconDrawable.getIntrinsicHeight() : super.getIntrinsicHeight();
    }

    @Override // defpackage.at0, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable iconDrawable = getIconDrawable();
        return iconDrawable != null ? iconDrawable.getIntrinsicWidth() : super.getIntrinsicWidth();
    }

    @Override // defpackage.at0
    public at0 onMutate() {
        return new BlockedGhostAvatarDrawable();
    }
}
