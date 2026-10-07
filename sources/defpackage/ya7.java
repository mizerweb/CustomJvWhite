package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.fragment.app.e;
import androidx.fragment.app.strictmode.FragmentTagUsageViolation;

/* JADX INFO: loaded from: classes.dex */
public final class ya7 implements LayoutInflater.Factory2 {
    public final c a;

    public ya7(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean zIsAssignableFrom;
        e eVarG;
        boolean zEquals = xa7.class.getName().equals(str);
        c cVar = this.a;
        if (zEquals) {
            return new xa7(context, attributeSet, cVar);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h3e.a);
            if (attributeValue == null) {
                attributeValue = typedArrayObtainStyledAttributes.getString(0);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            String string = typedArrayObtainStyledAttributes.getString(2);
            typedArrayObtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    zIsAssignableFrom = a.class.isAssignableFrom(bb7.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    zIsAssignableFrom = false;
                }
                if (zIsAssignableFrom) {
                    int id = view != null ? view.getId() : 0;
                    if (id == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    a aVarD = resourceId != -1 ? cVar.D(resourceId) : null;
                    if (aVarD == null && string != null) {
                        aVarD = cVar.E(string);
                    }
                    if (aVarD == null && id != -1) {
                        aVarD = cVar.D(id);
                    }
                    if (aVarD == null) {
                        bb7 bb7VarH = cVar.H();
                        context.getClassLoader();
                        aVarD = bb7VarH.a(attributeValue);
                        aVarD.n = true;
                        aVarD.x = resourceId != 0 ? resourceId : id;
                        aVarD.y = id;
                        aVarD.z = string;
                        aVarD.o = true;
                        aVarD.t = cVar;
                        va7 va7Var = cVar.v;
                        aVarD.u = va7Var;
                        b bVar = va7Var.h;
                        aVarD.B();
                        eVarG = cVar.a(aVarD);
                        if (c.K(2)) {
                            Log.v("FragmentManager", "Fragment " + aVarD + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        if (aVarD.o) {
                            throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                        }
                        aVarD.o = true;
                        aVarD.t = cVar;
                        va7 va7Var2 = cVar.v;
                        aVarD.u = va7Var2;
                        b bVar2 = va7Var2.h;
                        aVarD.B();
                        eVarG = cVar.g(aVarD);
                        if (c.K(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + aVarD + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    lb7 lb7Var = mb7.a;
                    mb7.b(new FragmentTagUsageViolation(aVarD, viewGroup));
                    mb7.a(aVarD).getClass();
                    aVarD.H = viewGroup;
                    eVarG.j();
                    eVarG.i();
                    ore.k(c0a.o("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
