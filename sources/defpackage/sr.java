package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.util.Base64;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.CameraEnumerator;
import org.webrtc.CameraVideoCapturer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class sr implements CameraEnumerator {
    public Object a;
    public Object b;

    public sr(int i) {
        switch (i) {
            case 5:
                this.a = new SparseIntArray();
                this.b = new SparseIntArray();
                break;
            default:
                this.a = gvk.b(1);
                this.b = new i64();
                break;
        }
    }

    public ArrayList E() {
        jf2 if2Var;
        ArrayList arrayList = new ArrayList();
        for (String str : getDeviceNames()) {
            List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = F().getSupportedFormats(str);
            if (isFrontFacing(str)) {
                supportedFormats.getClass();
                if2Var = new hf2(str, supportedFormats);
            } else if (F().isBackFacing(str)) {
                supportedFormats.getClass();
                if2Var = new gf2(str, supportedFormats);
            } else {
                supportedFormats.getClass();
                if2Var = new if2(str, supportedFormats);
            }
            arrayList.add(if2Var);
        }
        return arrayList;
    }

    public abstract CameraEnumerator F();

    public jf2 I(int i) {
        Object obj = null;
        if (i == 0) {
            throw null;
        }
        ArrayList arrayListE = E();
        int i2 = fq0.$EnumSwitchMapping$0[qt4.D(i)];
        if (i2 == 1) {
            for (Object obj2 : arrayListE) {
                if (((jf2) obj2) instanceof hf2) {
                    obj = obj2;
                    break;
                }
            }
            return (jf2) obj;
        }
        if (i2 == 2) {
            for (Object obj3 : arrayListE) {
                if (((jf2) obj3) instanceof gf2) {
                    obj = obj3;
                    break;
                }
            }
            return (jf2) obj;
        }
        if (i2 != 3) {
            ore.o();
            return null;
        }
        for (Object obj4 : arrayListE) {
            if (((jf2) obj4) instanceof if2) {
                obj = obj4;
                break;
            }
        }
        return (jf2) obj;
    }

    public int K() {
        if (((ny8) this.b).d()) {
            return Q().getMeasuredHeight();
        }
        return 0;
    }

    public int L() {
        if (((ny8) this.b).d()) {
            return Q().getMeasuredWidth();
        }
        return 0;
    }

    public MenuItem M(MenuItem menuItem) {
        if (!(menuItem instanceof zah)) {
            return menuItem;
        }
        zah zahVar = (zah) menuItem;
        if (((h6g) this.b) == null) {
            this.b = new h6g(0);
        }
        MenuItem menuItem2 = (MenuItem) ((h6g) this.b).get(zahVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        gca gcaVar = new gca((Context) this.a, zahVar);
        ((h6g) this.b).put(zahVar, gcaVar);
        return gcaVar;
    }

    public int N(int i, int i2) {
        int iP = P(i);
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            int iP2 = P(i5);
            i3 += iP2;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = iP2;
            }
        }
        return i3 + iP > i2 ? i4 + 1 : i4;
    }

    public int O(int i, int i2) {
        int iP = P(i);
        if (iP == i2) {
            return 0;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            int iP2 = P(i4);
            i3 += iP2;
            if (i3 == i2) {
                i3 = 0;
            } else if (i3 > i2) {
                i3 = iP2;
            }
        }
        if (iP + i3 <= i2) {
            return i3;
        }
        return 0;
    }

    public abstract int P(int i);

    public View Q() {
        return (View) ((ny8) this.b).getValue();
    }

    public View R() {
        if (((ny8) this.b).d()) {
            return Q();
        }
        return null;
    }

    public void S() {
        ((SparseIntArray) this.a).clear();
    }

    public void T(int i, int i2) {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            qyj.M(Q(), i, i2, 0, 12);
        }
    }

    public void U(int i, int i2) {
        ny8 ny8Var = (ny8) this.b;
        if (ny8Var.d()) {
            ((View) ny8Var.getValue()).measure(i, i2);
        }
    }

    public abstract void V();

    public void W(View view) {
    }

    public void X(String str, Serializable serializable) {
        String strEncodeToString;
        str.getClass();
        serializable.getClass();
        SharedPreferences.Editor editorEdit = ((SharedPreferences) this.b).edit();
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(serializable);
                    objectOutputStream.close();
                    strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    byteArrayOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        rx8.n(objectOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    rx8.n(byteArrayOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Exception e) {
            ((y3e) ((af7) this.a).invoke()).logException("PersistentDataSourceImpl", "Error during serializing object " + serializable, e);
            strEncodeToString = null;
        }
        editorEdit.putString(str, strEncodeToString).apply();
    }

    public void Y() {
        t();
        IntentFilter intentFilterU = u();
        if (intentFilterU.countActions() == 0) {
            return;
        }
        if (((cg) this.a) == null) {
            this.a = new cg(1, this);
        }
        ((vr) this.b).k.registerReceiver((cg) this.a, intentFilterU);
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CaptureFormatHelper captureFormatHelper, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider) {
        str.getClass();
        try {
            return F().createCapturer(str, cameraEventsHandler, captureFormatHelper, cameraConfigurationProvider);
        } catch (Exception e) {
            y3e y3eVar = (y3e) this.a;
            String str2 = (String) this.b;
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            y3eVar.reportException(str2, message, e);
            return null;
        }
    }

    @Override // org.webrtc.CameraEnumerator
    public String[] getDeviceNames() {
        String[] deviceNames = F().getDeviceNames();
        deviceNames.getClass();
        return deviceNames;
    }

    @Override // org.webrtc.CameraEnumerator
    public List getSupportedFormats(String str) {
        str.getClass();
        List<CameraEnumerationAndroid.CaptureFormat> supportedFormats = F().getSupportedFormats(str);
        supportedFormats.getClass();
        return supportedFormats;
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isBackFacing(String str) {
        str.getClass();
        return F().isBackFacing(str);
    }

    @Override // org.webrtc.CameraEnumerator
    public boolean isFrontFacing(String str) {
        str.getClass();
        return F().isFrontFacing(str);
    }

    public void r() {
        ViewGroup viewGroup = (ViewGroup) this.a;
        if (viewGroup == null) {
            viewGroup = null;
        }
        yab.d(viewGroup, Q(), new ViewGroup.LayoutParams(-2, -2));
        Q().setVisibility(0);
    }

    public void t() {
        cg cgVar = (cg) this.a;
        if (cgVar != null) {
            try {
                ((vr) this.b).k.unregisterReceiver(cgVar);
            } catch (IllegalArgumentException unused) {
            }
            this.a = null;
        }
    }

    public abstract IntentFilter u();

    public Serializable y(String str, Class cls) {
        str.getClass();
        String string = ((SharedPreferences) this.b).getString(str, null);
        if (string != null) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(string, 0));
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        Object object = objectInputStream.readObject();
                        object.getClass();
                        Serializable serializable = (Serializable) object;
                        objectInputStream.close();
                        byteArrayInputStream.close();
                        return serializable;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            rx8.n(objectInputStream, th);
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        rx8.n(byteArrayInputStream, th3);
                        throw th4;
                    }
                }
            } catch (Exception e) {
                ((y3e) ((af7) this.a).invoke()).logException("PersistentDataSourceImpl", "Error during deserializing string ".concat(string), e);
            }
        }
        return null;
    }

    @Override // org.webrtc.CameraEnumerator
    public CameraVideoCapturer createCapturer(String str, CameraVideoCapturer.CameraEventsHandler cameraEventsHandler, CameraVideoCapturer.CameraConfigurationProvider cameraConfigurationProvider) {
        str.getClass();
        try {
            return F().createCapturer(str, cameraEventsHandler, cameraConfigurationProvider);
        } catch (Exception e) {
            y3e y3eVar = (y3e) this.a;
            String str2 = (String) this.b;
            String message = e.getMessage();
            if (message == null) {
                message = "camera error";
            }
            y3eVar.reportException(str2, message, e);
            return null;
        }
    }

    public sr(y3e y3eVar) {
        y3eVar.getClass();
        this.a = y3eVar;
        this.b = getClass().getSimpleName();
    }

    public sr(cf7 cf7Var) {
        this.b = rx8.P(3, new z2(cf7Var, 7, this));
    }

    public sr(Context context) {
        this.a = context;
    }

    public sr(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public sr(af7 af7Var, Context context, String str) {
        context.getClass();
        this.a = af7Var;
        this.b = context.getSharedPreferences(str, 0);
    }

    public sr(vr vrVar) {
        this.b = vrVar;
    }
}
