package one.me.sdk.richvector;

import android.graphics.Path;
import kotlin.Metadata;
import org.apache.http.cookie.ClientCookie;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R&\u0010\u0004\u001a\u00020\u00032\b\b\u0001\u0010\u0002\u001a\u00020\u00038'@fX¦\u000e¢\u0006\f\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR&\u0010\t\u001a\u00020\u00032\b\b\u0001\u0010\u0002\u001a\u00020\u00038'@fX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u0018\u0010\f\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R&\u0010\u0012\u001a\u00020\u00032\b\b\u0001\u0010\u0002\u001a\u00020\u00038'@fX¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0019À\u0006\u0001"}, d2 = {"Lone/me/sdk/richvector/VectorPath;", "Lone/me/sdk/richvector/AnimationTarget;", SdkMetricStatEvent.VALUE_KEY, "", "fillColor", "getFillColor", "()I", "setFillColor", "(I)V", "strokeColor", "getStrokeColor", "setStrokeColor", "strokeWidth", "", "getStrokeWidth", "()F", "setStrokeWidth", "(F)V", "strokeAlpha", "getStrokeAlpha", "setStrokeAlpha", ClientCookie.PATH_ATTR, "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "rich-vector"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface VectorPath extends AnimationTarget {
    int getFillColor();

    Path getPath();

    int getStrokeAlpha();

    int getStrokeColor();

    float getStrokeWidth();

    void setFillColor(int i);

    void setStrokeAlpha(int i);

    void setStrokeColor(int i);

    void setStrokeWidth(float f);
}
