package one.me.sdk.richvector;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.util.LruCache;
import defpackage.cqk;
import defpackage.esi;
import defpackage.fsi;
import defpackage.hsi;
import defpackage.ht3;
import defpackage.nbh;
import defpackage.pgg;
import defpackage.qt4;
import defpackage.rj;
import defpackage.y96;
import java.io.IOException;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.richvector.internal.element.ClipPathElement;
import one.me.sdk.richvector.internal.element.GroupElement;
import one.me.sdk.richvector.internal.element.PathElement;
import one.me.sdk.richvector.internal.element.Shape;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u0000 T2\u00020\u00012\u00020\u0002:\u0001UB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u000bB\u0011\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0000H\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010#H\u0017¢\u0006\u0004\b%\u0010&J\u0019\u0010)\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010'H\u0017¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u00112\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0005H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0005H\u0016¢\u0006\u0004\b5\u00104J\u000f\u00106\u001a\u00020\u0005H\u0016¢\u0006\u0004\b6\u00104J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109J\u0019\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0011H\u0016¢\u0006\u0004\b?\u0010\u0013J\u0019\u0010C\u001a\u0004\u0018\u00010@2\u0006\u0010;\u001a\u00020:H\u0000¢\u0006\u0004\bA\u0010BJ\r\u0010D\u001a\u00020\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010FR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010GR\u0016\u0010H\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010FR\u0016\u0010K\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010FR\u0016\u0010L\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010FR\u0016\u0010M\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010FR\u0016\u0010N\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010OR\u0014\u0010R\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lone/me/sdk/richvector/EnhancedVectorDrawable;", "Landroid/graphics/drawable/Drawable;", "Lhsi;", "Landroid/content/Context;", "context", "", "resId", "<init>", "(Landroid/content/Context;I)V", "Landroid/content/res/Resources;", "resources", "(Landroid/content/res/Resources;I)V", "prototype", "(Lone/me/sdk/richvector/EnhancedVectorDrawable;)V", "Lone/me/sdk/richvector/internal/element/Shape;", "buildShape", "(I)Lone/me/sdk/richvector/internal/element/Shape;", "Lsbi;", "buildScaleMatrix", "()V", "scaleAllPaths", "scaleAllStrokes", "", SdkMetricStatEvent.VALUE_KEY, "dp", "(F)I", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "alpha", "setAlpha", "(I)V", "mutate", "()Lone/me/sdk/richvector/EnhancedVectorDrawable;", "Landroid/content/res/ColorStateList;", "tint", "setTintList", "(Landroid/content/res/ColorStateList;)V", "Landroid/graphics/PorterDuff$Mode;", "tintMode", "setTintMode", "(Landroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/Rect;", "bounds", "onBoundsChange", "(Landroid/graphics/Rect;)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "getIntrinsicWidth", "getIntrinsicHeight", "Landroid/graphics/drawable/Drawable$ConstantState;", "getConstantState", "()Landroid/graphics/drawable/Drawable$ConstantState;", "", SdkMetricStatEvent.NAME_KEY, "Lone/me/sdk/richvector/VectorPath;", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/VectorPath;", "invalidatePath", "Lone/me/sdk/richvector/AnimationTarget;", "findTarget$rich_vector", "(Ljava/lang/String;)Lone/me/sdk/richvector/AnimationTarget;", "findTarget", "getPixelSize", "()F", "I", "Landroid/content/res/Resources;", "shape", "Lone/me/sdk/richvector/internal/element/Shape;", "left", "top", "width", "height", "scaleRatio", "F", "strokeRatio", "Landroid/graphics/Matrix;", "scaleMatrix", "Landroid/graphics/Matrix;", "Companion", "y96", "rich-vector"}, k = 1, mv = {2, 3, 0}, xi = 48)
public class EnhancedVectorDrawable extends Drawable implements hsi {
    private static final y96 Companion = new y96();
    private static final String TAG = "EnhancedVectorDrawable";
    private int height;
    private int left;
    private final int resId;
    private final Resources resources;
    private final Matrix scaleMatrix;
    private float scaleRatio;
    private Shape shape;
    private float strokeRatio;
    private int top;
    private int width;

    public EnhancedVectorDrawable(Resources resources, int i) throws Resources.NotFoundException {
        Shape shapeBuildShape;
        this.scaleRatio = 1.0f;
        this.strokeRatio = 1.0f;
        this.scaleMatrix = new Matrix();
        this.resources = resources;
        this.resId = i;
        if (i != 0) {
            shapeBuildShape = buildShape(i);
        } else {
            Shape.Companion.getClass();
            shapeBuildShape = Shape.EMPTY;
        }
        this.shape = shapeBuildShape;
        setBounds(0, 0, dp(shapeBuildShape.getWidth()), dp(this.shape.getHeight()));
    }

    private final void buildScaleMatrix() {
        Matrix matrix = this.scaleMatrix;
        matrix.reset();
        matrix.postTranslate((this.width / 2.0f) - (this.shape.getViewportWidth() / 2.0f), (this.height / 2.0f) - (this.shape.getViewportHeight() / 2.0f));
        float fMin = Math.min(this.width / this.shape.getViewportWidth(), this.height / this.shape.getViewportHeight());
        this.scaleRatio = fMin;
        matrix.postScale(fMin, fMin, this.width / 2.0f, this.height / 2.0f);
    }

    private final Shape buildShape(int resId) throws Resources.NotFoundException {
        int i;
        int i2;
        Resources resources = this.resources;
        pgg pggVar = fsi.a;
        Shape shape = (Shape) ((LruCache) pggVar.a).get(Integer.valueOf(resId));
        if (shape != null) {
            return new Shape(shape);
        }
        XmlResourceParser xml = resources.getXml(resId);
        ht3 ht3Var = new ht3();
        ht3 ht3Var2 = new ht3();
        ht3 ht3Var3 = new ht3();
        Shape shape2 = new Shape(null, 0.0f, 0.0f, 0, 0.0f, 0.0f, null, 64, null);
        Stack stack = new Stack();
        try {
            try {
                PathElement pathElementM0 = null;
                ClipPathElement clipPathElementK0 = null;
                for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                    String name = xml.getName();
                    if (eventType == 2) {
                        int[] iArrH = qt4.H(4);
                        int length = iArrH.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length) {
                                i = 0;
                                break;
                            }
                            int i4 = iArrH[i3];
                            if (nbh.g(i4).equals(name)) {
                                i = i4;
                                break;
                            }
                            i3++;
                        }
                        int i5 = i == 0 ? -1 : esi.$EnumSwitchMapping$0[qt4.D(i)];
                        if (i5 == -1) {
                            continue;
                        } else if (i5 == 1) {
                            shape2 = new ht3().n0(xml);
                        } else if (i5 == 2) {
                            stack.push(ht3Var.l0(xml));
                        } else if (i5 == 3) {
                            pathElementM0 = ht3Var2.m0(xml);
                        } else {
                            if (i5 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            clipPathElementK0 = ht3Var3.k0(xml);
                        }
                    } else if (eventType == 3) {
                        int[] iArrH2 = qt4.H(4);
                        int length2 = iArrH2.length;
                        int i6 = 0;
                        while (true) {
                            if (i6 >= length2) {
                                i2 = 0;
                                break;
                            }
                            int i7 = iArrH2[i6];
                            if (nbh.g(i7).equals(name)) {
                                i2 = i7;
                                break;
                            }
                            i6++;
                        }
                        int i8 = i2 == 0 ? -1 : esi.$EnumSwitchMapping$0[qt4.D(i2)];
                        if (i8 == -1) {
                            continue;
                        } else if (i8 == 1) {
                            shape2.buildTransformMatrices();
                        } else if (i8 == 2) {
                            GroupElement groupElement = (GroupElement) stack.pop();
                            if (stack.isEmpty()) {
                                groupElement.setParent(null);
                                shape2.addGroup(groupElement);
                            } else {
                                groupElement.setParent((GroupElement) stack.peek());
                                ((GroupElement) stack.peek()).addGroup(groupElement);
                            }
                        } else if (i8 != 3) {
                            if (i8 != 4) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (clipPathElementK0 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            if (stack.isEmpty()) {
                                shape2.addClipPath(clipPathElementK0);
                            } else {
                                ((GroupElement) stack.peek()).addClipPath(clipPathElementK0);
                            }
                        } else {
                            if (pathElementM0 == null) {
                                throw new IllegalArgumentException("Required value was null.");
                            }
                            if (stack.isEmpty()) {
                                shape2.addPath(pathElementM0);
                            } else {
                                ((GroupElement) stack.peek()).addPath(pathElementM0);
                            }
                            shape2.appendToFullPath(pathElementM0.getPath());
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } catch (XmlPullParserException e2) {
                e2.printStackTrace();
            }
            xml.close();
            ((LruCache) pggVar.a).put(Integer.valueOf(resId), shape2);
            return new Shape(shape2);
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    private final int dp(float f) {
        return (int) (this.resources.getDisplayMetrics().density * f);
    }

    private final void scaleAllPaths() {
        this.shape.scaleAllPaths(this.scaleMatrix);
    }

    private final void scaleAllStrokes() {
        float fMin = Math.min(this.width / this.shape.getWidth(), this.height / this.shape.getHeight());
        this.strokeRatio = fMin;
        this.shape.scaleAllStrokeWidth(fMin);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        setAlpha(this.shape.getAlpha());
        int i = this.left;
        if (i == 0 && this.top == 0) {
            this.shape.draw(canvas);
            return;
        }
        float f = this.top;
        int iSave = canvas.save();
        canvas.translate(i, f);
        try {
            this.shape.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // defpackage.hsi
    public VectorPath findPath(String str) {
        return this.shape.findPath(str);
    }

    public final AnimationTarget findTarget$rich_vector(String str) {
        boolean zD = cqk.d(this.shape.getName(), str);
        Shape shape = this.shape;
        if (zD) {
            return shape;
        }
        GroupElement groupElementFindGroup = shape.findGroup(str);
        if (groupElementFindGroup != null) {
            return groupElementFindGroup;
        }
        PathElement pathElementFindPath = this.shape.findPath(str);
        return pathElementFindPath != null ? pathElementFindPath : this.shape.findClipPath(str);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return new rj(this);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return dp(this.shape.getHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return dp(this.shape.getWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public final float getPixelSize() {
        if (this.shape.getWidth() == 0.0f || this.shape.getHeight() == 0.0f || this.shape.getViewportHeight() == 0.0f || this.shape.getViewportWidth() == 0.0f) {
            return 1.0f;
        }
        return Math.min(this.shape.getViewportWidth() / dp(this.shape.getWidth()), this.shape.getViewportHeight() / dp(this.shape.getHeight()));
    }

    @Override // defpackage.hsi
    public void invalidatePath() {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public EnhancedVectorDrawable mutate() {
        return new EnhancedVectorDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect bounds) {
        super.onBoundsChange(bounds);
        if (bounds.width() == 0 || bounds.height() == 0) {
            return;
        }
        this.left = bounds.left;
        this.top = bounds.top;
        this.width = bounds.width();
        this.height = bounds.height();
        buildScaleMatrix();
        scaleAllPaths();
        scaleAllStrokes();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.shape.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
        Log.w(TAG, "tint list is not supported yet");
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
        Log.w(TAG, "tint mode is not supported yet");
    }

    public EnhancedVectorDrawable(Context context, int i) {
        this(context.getResources(), i);
    }

    public EnhancedVectorDrawable(EnhancedVectorDrawable enhancedVectorDrawable) {
        this.scaleRatio = 1.0f;
        this.strokeRatio = 1.0f;
        this.scaleMatrix = new Matrix();
        this.resources = enhancedVectorDrawable.resources;
        this.resId = enhancedVectorDrawable.resId;
        Shape shape = new Shape(enhancedVectorDrawable.shape);
        this.shape = shape;
        setBounds(0, 0, dp(shape.getWidth()), dp(this.shape.getHeight()));
    }
}
