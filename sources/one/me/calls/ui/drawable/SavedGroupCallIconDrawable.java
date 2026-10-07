package one.me.calls.ui.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import defpackage.at0;
import defpackage.fn8;
import defpackage.ha9;
import defpackage.ifh;
import defpackage.ize;
import defpackage.n0f;
import defpackage.ny8;
import defpackage.pq3;
import defpackage.r7;
import defpackage.sx1;
import defpackage.xs0;
import defpackage.zs0;
import kotlin.Metadata;
import org.xmlpull.v1.XmlPullParser;
import ru.oneme.app.R;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0004\u001a\u00020\u0001H\u0014¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0018\u00010\fR\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00118\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0013R\u001a\u0010\"\u001a\u00020!8\u0014X\u0094D¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010*\u001a\u00020&8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001a\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lone/me/calls/ui/drawable/SavedGroupCallIconDrawable;", "Lat0;", "<init>", "()V", "onMutate", "()Lat0;", "Landroid/content/res/Resources;", "resources", "Lorg/xmlpull/v1/XmlPullParser;", "parser", "Landroid/util/AttributeSet;", "attrs", "Landroid/content/res/Resources$Theme;", "theme", "Lsbi;", "onDrawablesInflated", "(Landroid/content/res/Resources;Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;)V", "", "getIntrinsicWidth", "()I", "getIntrinsicHeight", "Lsx1;", "callScreenComponent", "Lsx1;", "Landroid/content/Context;", "context$delegate", "Lny8;", "getContext", "()Landroid/content/Context;", "context", "iconResId", "I", "getIconResId", "", "iconScale", "F", "getIconScale", "()F", "Lzs0;", "backgroundSpec$delegate", "getBackgroundSpec", "()Lzs0;", "backgroundSpec", "Companion", "n0f", "calls-ui"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SavedGroupCallIconDrawable extends at0 {
    private static final n0f Companion = new n0f();
    private static final float ICON_SCALE = 0.6f;

    /* JADX INFO: renamed from: backgroundSpec$delegate, reason: from kotlin metadata */
    private final ny8 backgroundSpec;
    private final sx1 callScreenComponent;

    /* JADX INFO: renamed from: context$delegate, reason: from kotlin metadata */
    private final ny8 context;
    private final int iconResId;
    private final float iconScale;

    public SavedGroupCallIconDrawable() {
        r7 r7Var = r7.a;
        sx1 sx1Var = new sx1(r7.d(ha9.b));
        this.callScreenComponent = sx1Var;
        this.context = sx1Var.getAccessor().d(7);
        this.iconResId = R.drawable.ic_group_call_fill_16;
        this.iconScale = ICON_SCALE;
        this.backgroundSpec = new ifh(new ize(1, this));
    }

    public static final xs0 backgroundSpec_delegate$lambda$0(SavedGroupCallIconDrawable savedGroupCallIconDrawable) {
        return new xs0(((fn8) pq3.j.e(savedGroupCallIconDrawable.getContext()).m().u().c.b).c);
    }

    private final Context getContext() {
        return (Context) this.context.getValue();
    }

    @Override // defpackage.at0
    public zs0 getBackgroundSpec() {
        return (zs0) this.backgroundSpec.getValue();
    }

    @Override // defpackage.at0
    public int getIconResId() {
        return this.iconResId;
    }

    @Override // defpackage.at0
    public float getIconScale() {
        return this.iconScale;
    }

    @Override // defpackage.at0, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return getBounds().height();
    }

    @Override // defpackage.at0, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return getBounds().width();
    }

    @Override // defpackage.at0
    public void onDrawablesInflated(Resources resources, XmlPullParser parser, AttributeSet attrs, Resources.Theme theme) {
        setIconTint(((fn8) pq3.j.e(getContext()).m().u().d.b).d);
    }

    @Override // defpackage.at0
    public at0 onMutate() {
        return new SavedGroupCallIconDrawable();
    }
}
