package one.me.common.drawable;

import android.graphics.Rect;
import defpackage.at0;
import defpackage.eph;
import defpackage.gm0;
import defpackage.kbc;
import defpackage.t0f;
import defpackage.xs0;
import defpackage.yl5;
import defpackage.zs0;
import kotlin.Metadata;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001#B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0001H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\t8\u0014X\u0094D¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00158\u0014X\u0094D¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\t8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lone/me/common/drawable/SavedMessagesIconDrawable;", "Lat0;", "Leph;", "<init>", "()V", "onMutate", "()Lat0;", "Landroid/graphics/Rect;", "container", "", "computeIconSize", "(Landroid/graphics/Rect;)I", "Lkbc;", "newAttrs", "Lsbi;", "onThemeChanged", "(Lkbc;)V", "iconResId", "I", "getIconResId", "()I", "", "iconScale", "F", "getIconScale", "()F", "intrinsicSizePx", "getIntrinsicSizePx", "()Ljava/lang/Integer;", "Lzs0;", "backgroundSpec", "Lzs0;", "getBackgroundSpec", "()Lzs0;", "Companion", "t0f", "common"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SavedMessagesIconDrawable extends at0 implements eph {
    private static final t0f Companion = new t0f();
    private static final float SCALE_FACTOR = 0.5f;
    private static final int SMALL_ICON_SIZE = 20;
    private static final int SMALL_SIZE = 40;
    private final int iconResId = R.drawable.icon_bookmark_fill;
    private final float iconScale = SCALE_FACTOR;
    private final int intrinsicSizePx = gm0.K(40.0f * yl5.d().getDisplayMetrics().density);
    private final zs0 backgroundSpec = new xs0(0);

    @Override // defpackage.at0
    public int computeIconSize(Rect container) {
        return Math.max(super.computeIconSize(container), gm0.K(20.0f * yl5.d().getDisplayMetrics().density));
    }

    @Override // defpackage.at0
    public zs0 getBackgroundSpec() {
        return this.backgroundSpec;
    }

    @Override // defpackage.at0
    public int getIconResId() {
        return this.iconResId;
    }

    @Override // defpackage.at0
    public float getIconScale() {
        return this.iconScale;
    }

    @Override // defpackage.at0
    public Integer getIntrinsicSizePx() {
        return Integer.valueOf(this.intrinsicSizePx);
    }

    @Override // defpackage.at0
    public at0 onMutate() {
        return new SavedMessagesIconDrawable();
    }

    @Override // defpackage.eph
    public void onThemeChanged(kbc newAttrs) {
        setBackgroundColor(newAttrs.h().a);
        setIconTint(-1);
    }
}
