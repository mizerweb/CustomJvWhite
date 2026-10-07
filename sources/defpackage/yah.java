package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import ru.ok.android.externcalls.analytics.internal.storage.DatabaseHelper;

/* JADX INFO: loaded from: classes4.dex */
public final class yah extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public yah(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        xah xahVar = new xah(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    ore.q("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                ore.q("Unexpected end of document");
                return;
            }
            Menu menu2 = xahVar.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l3e.p);
                        xahVar.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        xahVar.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        xahVar.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        xahVar.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        xahVar.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        xahVar.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals(DatabaseHelper.ITEM_COLUMN_NAME)) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, l3e.q);
                        xahVar.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        xahVar.j = (typedArrayObtainStyledAttributes2.getInt(5, xahVar.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, xahVar.d) & 65535);
                        xahVar.k = typedArrayObtainStyledAttributes2.getText(7);
                        xahVar.l = typedArrayObtainStyledAttributes2.getText(8);
                        xahVar.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        xahVar.n = string == null ? (char) 0 : string.charAt(0);
                        xahVar.o = typedArrayObtainStyledAttributes2.getInt(16, np0.r);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        xahVar.p = string2 == null ? (char) 0 : string2.charAt(0);
                        xahVar.q = typedArrayObtainStyledAttributes2.getInt(20, np0.r);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            xahVar.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            xahVar.r = xahVar.e;
                        }
                        xahVar.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        xahVar.t = typedArrayObtainStyledAttributes2.getBoolean(4, xahVar.f);
                        xahVar.u = typedArrayObtainStyledAttributes2.getBoolean(1, xahVar.g);
                        xahVar.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        xahVar.y = typedArrayObtainStyledAttributes2.getString(12);
                        xahVar.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        xahVar.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && xahVar.w == 0 && xahVar.x == null) {
                            xahVar.z = (dca) xahVar.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            xahVar.z = null;
                        }
                        xahVar.A = typedArrayObtainStyledAttributes2.getText(17);
                        xahVar.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            xahVar.D = vt5.c(typedArrayObtainStyledAttributes2.getInt(19, -1), xahVar.D);
                        } else {
                            xahVar.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = np4.l(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            xahVar.C = colorStateList;
                        } else {
                            xahVar.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        xahVar.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        xahVar.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(xahVar.b, xahVar.i, xahVar.j, xahVar.k);
                        xahVar.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        xahVar.b = 0;
                        xahVar.c = 0;
                        xahVar.d = 0;
                        xahVar.e = 0;
                        xahVar.f = true;
                        xahVar.g = true;
                    } else if (name3.equals(DatabaseHelper.ITEM_COLUMN_NAME)) {
                        if (!xahVar.h) {
                            dca dcaVar = xahVar.z;
                            if (dcaVar == null || !dcaVar.b.hasSubMenu()) {
                                xahVar.h = true;
                                xahVar.b(menu2.add(xahVar.b, xahVar.i, xahVar.j, xahVar.k));
                            } else {
                                xahVar.h = true;
                                xahVar.b(menu2.addSubMenu(xahVar.b, xahVar.i, xahVar.j, xahVar.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof yba)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof yba) {
                    yba ybaVar = (yba) menu;
                    if (!ybaVar.p) {
                        ybaVar.z();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((yba) menu).y();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((yba) menu).y();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
