package one.me.sdk.richvector.internal.element;

import android.graphics.Canvas;
import android.graphics.Matrix;
import defpackage.c0a;
import defpackage.e9i;
import defpackage.j95;
import defpackage.nbh;
import defpackage.np0;
import defpackage.qv1;
import defpackage.ww3;
import defpackage.xw3;
import java.util.List;
import kotlin.Metadata;
import one.me.sdk.richvector.AnimationTarget;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010 \n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B_\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010B\u001d\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0000\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u000f\u0010\u0012J\r\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001d\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0000H\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b \u0010!J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\"H\u0096\u0001¢\u0006\u0004\b#\u0010$J\u0018\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0005H\u0096\u0001¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020\u00132\u0006\u0010)\u001a\u00020(H\u0096\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010,\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00100\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0013H\u0002¢\u0006\u0004\b2\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b4\u0010\u001bR$\u0010\r\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u0010\u001eR*\u0010\u0006\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010'R*\u0010\u0007\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010:\u001a\u0004\b>\u0010<\"\u0004\b?\u0010'R*\u0010\b\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010<\"\u0004\bA\u0010'R*\u0010\t\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010:\u001a\u0004\bB\u0010<\"\u0004\bC\u0010'R*\u0010\n\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010:\u001a\u0004\bD\u0010<\"\u0004\bE\u0010'R*\u0010\u000b\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010:\u001a\u0004\bF\u0010<\"\u0004\bG\u0010'R*\u0010\f\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00058\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010:\u001a\u0004\bH\u0010<\"\u0004\bI\u0010'R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010JR\u0014\u0010K\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010JR\u0014\u0010L\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010JR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00000M8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bN\u0010OR\u001a\u0010R\u001a\b\u0012\u0004\u0012\u00020\u001f0M8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020\"0M8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bS\u0010O¨\u0006U"}, d2 = {"Lone/me/sdk/richvector/internal/element/GroupElement;", "Lone/me/sdk/richvector/internal/element/ElementHolder;", "Lone/me/sdk/richvector/AnimationTarget;", "", SdkMetricStatEvent.NAME_KEY, "", "pivotX", "pivotY", "rotation", "scaleX", "scaleY", "translateX", "translateY", "parent", "elementHolder", "<init>", "(Ljava/lang/String;FFFFFFFLone/me/sdk/richvector/internal/element/GroupElement;Lone/me/sdk/richvector/internal/element/ElementHolder;)V", "prototype", "(Lone/me/sdk/richvector/internal/element/GroupElement;Lone/me/sdk/richvector/internal/element/GroupElement;)V", "Lsbi;", "buildTransformMatrix", "()V", "Landroid/graphics/Matrix;", "scaleMatrix", "scaleAllPaths", "(Landroid/graphics/Matrix;)V", "toString", "()Ljava/lang/String;", "element", "addGroup", "(Lone/me/sdk/richvector/internal/element/GroupElement;)V", "Lone/me/sdk/richvector/internal/element/PathElement;", "addPath", "(Lone/me/sdk/richvector/internal/element/PathElement;)V", "Lone/me/sdk/richvector/internal/element/ClipPathElement;", "addClipPath", "(Lone/me/sdk/richvector/internal/element/ClipPathElement;)V", "ratio", "scaleAllStrokeWidth", "(F)V", "Landroid/graphics/Canvas;", "canvas", "draw", "(Landroid/graphics/Canvas;)V", "findPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/PathElement;", "findGroup", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/GroupElement;", "findClipPath", "(Ljava/lang/String;)Lone/me/sdk/richvector/internal/element/ClipPathElement;", "invalidateTransforms", "Ljava/lang/String;", "getName", "Lone/me/sdk/richvector/internal/element/GroupElement;", "getParent", "()Lone/me/sdk/richvector/internal/element/GroupElement;", "setParent", SdkMetricStatEvent.VALUE_KEY, "F", "getPivotX", "()F", "setPivotX", "getPivotY", "setPivotY", "getRotation", "setRotation", "getScaleX", "setScaleX", "getScaleY", "setScaleY", "getTranslateX", "setTranslateX", "getTranslateY", "setTranslateY", "Landroid/graphics/Matrix;", "originalTransformMatrix", "finalTransformMatrix", "", "getGroupElements", "()Ljava/util/List;", "groupElements", "getPathElements", "pathElements", "getClipPathElements", "clipPathElements", "rich-vector"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupElement implements ElementHolder, AnimationTarget {
    private final /* synthetic */ ElementHolder $$delegate_0;
    private final Matrix finalTransformMatrix;
    private final String name;
    private final Matrix originalTransformMatrix;
    private GroupElement parent;
    private float pivotX;
    private float pivotY;
    private float rotation;
    private final Matrix scaleMatrix;
    private float scaleX;
    private float scaleY;
    private float translateX;
    private float translateY;

    /* JADX WARN: Illegal instructions before constructor call */
    public GroupElement(GroupElement groupElement, GroupElement groupElement2) {
        GroupElement groupElement3;
        String str = groupElement.name;
        float f = groupElement.pivotX;
        float f2 = groupElement.pivotY;
        float f3 = groupElement.rotation;
        float f4 = groupElement.scaleX;
        float f5 = groupElement.scaleY;
        float f6 = groupElement.translateX;
        float f7 = groupElement.translateY;
        if (groupElement2 == null) {
            GroupElement groupElement4 = groupElement.parent;
            groupElement3 = groupElement4 != null ? new GroupElement(groupElement4, null, 2, 0 == true ? 1 : 0) : null;
        } else {
            groupElement3 = groupElement2;
        }
        this(str, f, f2, f3, f4, f5, f6, f7, groupElement3, new ElementHolderImpl());
        this.scaleMatrix.set(groupElement.scaleMatrix);
        this.originalTransformMatrix.set(groupElement.originalTransformMatrix);
        this.finalTransformMatrix.set(groupElement.finalTransformMatrix);
        List listI = e9i.i(getGroupElements());
        List<GroupElement> groupElements = groupElement.getGroupElements();
        int iO0 = xw3.O0(groupElements);
        int i = 0;
        if (iO0 >= 0) {
            int i2 = 0;
            while (true) {
                Object objU1 = ww3.u1(i2, groupElements);
                if (objU1 != null) {
                    listI.add(new GroupElement((GroupElement) objU1, this));
                }
                if (i2 == iO0) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        List listI2 = e9i.i(getPathElements());
        List<PathElement> pathElements = groupElement.getPathElements();
        int iO1 = xw3.O0(pathElements);
        if (iO1 >= 0) {
            int i3 = 0;
            while (true) {
                Object objU2 = ww3.u1(i3, pathElements);
                if (objU2 != null) {
                    listI2.add(new PathElement((PathElement) objU2));
                }
                if (i3 == iO1) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List listI3 = e9i.i(getClipPathElements());
        List<ClipPathElement> clipPathElements = groupElement.getClipPathElements();
        int iO2 = xw3.O0(clipPathElements);
        if (iO2 < 0) {
            return;
        }
        while (true) {
            Object objU3 = ww3.u1(i, clipPathElements);
            if (objU3 != null) {
                listI3.add(new ClipPathElement((ClipPathElement) objU3));
            }
            if (i == iO2) {
                return;
            } else {
                i++;
            }
        }
    }

    private final void invalidateTransforms() {
        this.finalTransformMatrix.set(this.originalTransformMatrix);
        this.finalTransformMatrix.postConcat(this.scaleMatrix);
        List<GroupElement> groupElements = getGroupElements();
        int iO0 = xw3.O0(groupElements);
        int i = 0;
        if (iO0 >= 0) {
            int i2 = 0;
            while (true) {
                Object objU1 = ww3.u1(i2, groupElements);
                if (objU1 != null) {
                    ((GroupElement) objU1).scaleAllPaths(this.scaleMatrix);
                }
                if (i2 == iO0) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        List<PathElement> pathElements = getPathElements();
        int iO1 = xw3.O0(pathElements);
        if (iO1 >= 0) {
            int i3 = 0;
            while (true) {
                Object objU2 = ww3.u1(i3, pathElements);
                if (objU2 != null) {
                    ((PathElement) objU2).transform(this.finalTransformMatrix);
                }
                if (i3 == iO1) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        List<ClipPathElement> clipPathElements = getClipPathElements();
        int iO2 = xw3.O0(clipPathElements);
        if (iO2 < 0) {
            return;
        }
        while (true) {
            Object objU3 = ww3.u1(i, clipPathElements);
            if (objU3 != null) {
                ((ClipPathElement) objU3).transform(this.finalTransformMatrix);
            }
            if (i == iO2) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public void addClipPath(ClipPathElement element) {
        this.$$delegate_0.addClipPath(element);
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public void addGroup(GroupElement element) {
        this.$$delegate_0.addGroup(element);
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public void addPath(PathElement element) {
        this.$$delegate_0.addPath(element);
    }

    public final void buildTransformMatrix() {
        Matrix matrix = this.originalTransformMatrix;
        matrix.reset();
        matrix.postScale(this.scaleX, this.scaleY, this.pivotX, this.pivotY);
        matrix.postRotate(this.rotation, this.pivotX, this.pivotY);
        matrix.postTranslate(this.translateX, this.translateY);
        GroupElement groupElement = this.parent;
        if (groupElement != null) {
            this.originalTransformMatrix.postConcat(groupElement.originalTransformMatrix);
        }
        List<GroupElement> groupElements = getGroupElements();
        int iO0 = xw3.O0(groupElements);
        if (iO0 >= 0) {
            int i = 0;
            while (true) {
                Object objU1 = ww3.u1(i, groupElements);
                if (objU1 != null) {
                    ((GroupElement) objU1).buildTransformMatrix();
                }
                if (i == iO0) {
                    break;
                } else {
                    i++;
                }
            }
        }
        invalidateTransforms();
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public void draw(Canvas canvas) {
        this.$$delegate_0.draw(canvas);
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public ClipPathElement findClipPath(String name) {
        return this.$$delegate_0.findClipPath(name);
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public GroupElement findGroup(String name) {
        return this.$$delegate_0.findGroup(name);
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public PathElement findPath(String name) {
        return this.$$delegate_0.findPath(name);
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public List<ClipPathElement> getClipPathElements() {
        return this.$$delegate_0.getClipPathElements();
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public List<GroupElement> getGroupElements() {
        return this.$$delegate_0.getGroupElements();
    }

    public final String getName() {
        return this.name;
    }

    public final GroupElement getParent() {
        return this.parent;
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public List<PathElement> getPathElements() {
        return this.$$delegate_0.getPathElements();
    }

    public final float getPivotX() {
        return this.pivotX;
    }

    public final float getPivotY() {
        return this.pivotY;
    }

    public final float getRotation() {
        return this.rotation;
    }

    public final float getScaleX() {
        return this.scaleX;
    }

    public final float getScaleY() {
        return this.scaleY;
    }

    public final float getTranslateX() {
        return this.translateX;
    }

    public final float getTranslateY() {
        return this.translateY;
    }

    public final void scaleAllPaths(Matrix scaleMatrix) {
        this.scaleMatrix.set(scaleMatrix);
        invalidateTransforms();
    }

    @Override // one.me.sdk.richvector.internal.element.ElementHolder
    public void scaleAllStrokeWidth(float ratio) {
        this.$$delegate_0.scaleAllStrokeWidth(ratio);
    }

    public final void setParent(GroupElement groupElement) {
        this.parent = groupElement;
    }

    public final void setPivotX(float f) {
        this.pivotX = f;
        buildTransformMatrix();
    }

    public final void setPivotY(float f) {
        this.pivotY = f;
        buildTransformMatrix();
    }

    public final void setRotation(float f) {
        this.rotation = f;
        buildTransformMatrix();
    }

    public final void setScaleX(float f) {
        this.scaleX = f;
        buildTransformMatrix();
    }

    public final void setScaleY(float f) {
        this.scaleY = f;
        buildTransformMatrix();
    }

    public final void setTranslateX(float f) {
        this.translateX = f;
        buildTransformMatrix();
    }

    public final void setTranslateY(float f) {
        this.translateY = f;
        buildTransformMatrix();
    }

    public String toString() {
        String str = this.name;
        GroupElement groupElement = this.parent;
        String strV = groupElement != null ? nbh.v(GroupElement.class.getCanonicalName(), "(name=", groupElement.name, ")") : null;
        float f = this.pivotX;
        float f2 = this.pivotY;
        float f3 = this.rotation;
        float f4 = this.scaleX;
        float f5 = this.scaleY;
        float f6 = this.translateX;
        float f7 = this.translateY;
        Matrix matrix = this.scaleMatrix;
        Matrix matrix2 = this.originalTransformMatrix;
        Matrix matrix3 = this.finalTransformMatrix;
        List<GroupElement> groupElements = getGroupElements();
        List<PathElement> pathElements = getPathElements();
        List<ClipPathElement> clipPathElements = getClipPathElements();
        StringBuilder sbQ = qv1.q("GroupElement(name=", str, ", parent=", strV, ", pivotX=");
        c0a.u(sbQ, f, ", pivotY=", f2, ", rotation=");
        c0a.u(sbQ, f3, ", scaleX=", f4, ", scaleY=");
        c0a.u(sbQ, f5, ", translateX=", f6, ", translateY=");
        sbQ.append(f7);
        sbQ.append(", scaleMatrix=");
        sbQ.append(matrix);
        sbQ.append(", originalTransformMatrix=");
        sbQ.append(matrix2);
        sbQ.append(", finalTransformMatrix=");
        sbQ.append(matrix3);
        sbQ.append(", groupElements=");
        sbQ.append(groupElements);
        sbQ.append(", pathElements=");
        sbQ.append(pathElements);
        sbQ.append(", clipPathElements=");
        return qv1.n(")", sbQ, clipPathElements);
    }

    public /* synthetic */ GroupElement(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, GroupElement groupElement, ElementHolder elementHolder, int i, j95 j95Var) {
        this(str, f, f2, f3, f4, f5, f6, f7, (i & np0.n) != 0 ? null : groupElement, (i & np0.o) != 0 ? new ElementHolderImpl() : elementHolder);
    }

    public /* synthetic */ GroupElement(GroupElement groupElement, GroupElement groupElement2, int i, j95 j95Var) {
        this(groupElement, (i & 2) != 0 ? null : groupElement2);
    }

    public GroupElement(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, GroupElement groupElement, ElementHolder elementHolder) {
        this.$$delegate_0 = elementHolder;
        this.name = str;
        this.parent = groupElement;
        this.pivotX = f;
        this.pivotY = f2;
        this.rotation = f3;
        this.scaleX = f4;
        this.scaleY = f5;
        this.translateX = f6;
        this.translateY = f7;
        this.scaleMatrix = new Matrix();
        this.originalTransformMatrix = new Matrix();
        this.finalTransformMatrix = new Matrix();
    }
}
