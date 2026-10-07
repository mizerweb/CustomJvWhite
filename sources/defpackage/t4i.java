package defpackage;

import java.util.Collections;
import ru.ok.android.onelog.impl.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t4i implements af7 {
    public final /* synthetic */ int a;

    @Override // defpackage.af7
    public final Object invoke() {
        boolean zS;
        int i = this.a;
        Class cls = Integer.TYPE;
        switch (i) {
            case 0:
                return Boolean.TRUE;
            case 1:
                try {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    zS = ch3.s((String) cls2.getMethod("get", String.class).invoke(cls2, "ro.miui.ui.version.code"));
                    break;
                } catch (Throwable unused) {
                    zS = false;
                }
                return Boolean.valueOf(zS);
            case 2:
                return Collections.singletonList(wk8.b("ac5547244c3321dc577d7a83503534cf416a33c04b307bde51"));
            case 3:
                return new s9k(Collections.singletonList(wk8.b("ac5547244c3321dc577d7a83503534cf416a33c04b307bde51")), xw3.P0(wk8.b("467309147c7d073667335c697d79057239601d32717b1d2360270a277a6d163e3a6716323b68032f3b7f43697d79"), wk8.b("70449996feed3000e5a36b5fffe93246bbf02a04f3eb2a15e2b73d11f8fd2108b8f72104b9f83419b9ef745fffe9"), wk8.b("5f5979660e0d2d2f154376700f1f3a30081f303848143c700f09"), wk8.b("130c73c0a8077863b349233ca103653da9036575b95d6361a7"), wk8.b("3a9264b6de10e64ac55ebd15d50cf759dd0de214d709f340d90af34dc54af155db"), wk8.b("0e2551650d25517e166b0a210c210b630438492017240a")), Collections.singletonList(new yik(1, wk8.b("e2827aef8e0aebcc8014e78f8a54f097"))), 10000, 0, 50, BuildConfig.MAX_TIME_TO_UPLOAD, 1.0f);
            case 4:
                return new lge(wk8.b("fd2941dc802301c2e61a19d0e51c52ccf07254a1f21a19d0e51c52ccf07254a1f21a19d0e51c52ccf07254a1f21a19d0e51c52ccf0725481877104c4bd6c4fbcf10713a0f77b72cdf17848d0ba0004bbe61c02d48023"));
            case 5:
                try {
                    return Class.forName(cjk.b(new String[]{wk8.b("ad43500a603135cc"), wk8.b("68afa6b5dbc3db"), wk8.b("eee214b3fd719699dc6689a7dd60879cd575818b")}));
                } catch (Exception unused2) {
                    return null;
                }
            case 6:
                try {
                    Class cls3 = (Class) cjk.a.getValue();
                    if (cls3 != null) {
                        return cls3.getMethod(wk8.b("ad431b4d246816dd"), null);
                    }
                    return null;
                } catch (Exception unused3) {
                    return null;
                }
            case 7:
                try {
                    Class cls4 = (Class) cjk.a.getValue();
                    if (cls4 != null) {
                        return cls4.getMethod(wk8.b("343c94197ef1487a78f959"), null);
                    }
                    return null;
                } catch (Exception unused4) {
                    return null;
                }
            case 8:
                try {
                    Class cls5 = (Class) cjk.b.getValue();
                    if (cls5 != null) {
                        return cls5.getMethod(wk8.b("83a70f97ff6ed4d7e56ec9f0e760d5f7"), cls);
                    }
                    return null;
                } catch (Exception unused5) {
                    return null;
                }
            case 9:
                try {
                    Class cls6 = (Class) cjk.b.getValue();
                    if (cls6 != null) {
                        return cls6.getMethod(wk8.b("22907fc1a61ae46ea811fb66ae08fe51b50df543ac3df14ca508f946b517db40b10c"), null);
                    }
                    return null;
                } catch (Exception unused6) {
                    return null;
                }
            case 10:
                try {
                    Class cls7 = (Class) cjk.b.getValue();
                    if (cls7 != null) {
                        return cls7.getMethod(wk8.b("28e91a6a027b9a6b0b6a884a0376805c13"), cls);
                    }
                    return null;
                } catch (Exception unused7) {
                    return null;
                }
            case 11:
                try {
                    Class cls8 = (Class) cjk.c.getValue();
                    if (cls8 != null) {
                        return cls8.getMethod(wk8.b("1a74667a1d03005b19121d6c1f28116e0d090671"), null);
                    }
                    return null;
                } catch (Exception unused8) {
                    return null;
                }
            case 12:
                try {
                    Class cls9 = (Class) cjk.c.getValue();
                    if (cls9 != null) {
                        return cls9.getMethod(wk8.b("d4c643781f26b295142f88b10c34a9a61330"), null);
                    }
                    return null;
                } catch (Exception unused9) {
                    return null;
                }
            case 13:
                try {
                    Class cls10 = (Class) cjk.c.getValue();
                    if (cls10 != null) {
                        return cls10.getMethod(wk8.b("b7c0c1b6d1a4b4f9d3b5b7d8c4aa83d6c6a0a2dedaa8b4ded3b2"), (Class) cjk.d.getValue());
                    }
                    return null;
                } catch (Exception unused10) {
                    return null;
                }
            case 14:
                try {
                    Class cls11 = (Class) cjk.c.getValue();
                    if (cls11 != null) {
                        return cls11.getMethod(wk8.b("086f16aec9731b46cb621867dc7d2666c879"), (Class) cjk.d.getValue());
                    }
                    return null;
                } catch (Exception unused11) {
                    return null;
                }
            case 15:
                try {
                    Class cls12 = (Class) cjk.c.getValue();
                    if (cls12 != null) {
                        return cls12.getMethod(wk8.b("64ab72482f17df252b06c2122d3cce103f1dd90f011ccd0b"), null);
                    }
                    return null;
                } catch (Exception unused12) {
                    return null;
                }
            case 16:
                try {
                    return Class.forName(cjk.b(new String[]{wk8.b("0561e787e6890577e88e05"), wk8.b("68afa6b5dbc3db"), wk8.b("6b0a7dfcb2187e1c930f61289d0d6b099511631f951879")}));
                } catch (Exception unused13) {
                    return null;
                }
            case 17:
                try {
                    return Class.forName(cjk.b(new String[]{wk8.b("0561e787e6890577e88e05"), wk8.b("68afa6b5dbc3db"), wk8.b("3c11c6eeada97f528ba5655598af6545a3a77f5d89a363")}));
                } catch (Exception unused14) {
                    return null;
                }
            case 18:
                try {
                    return Class.forName(cjk.b(new String[]{wk8.b("0561e787e6890577e88e05"), wk8.b("68afa6b5dbc3db"), wk8.b("09d3a32668c6a77e49d1b8")}));
                } catch (Exception unused15) {
                    return null;
                }
            default:
                try {
                    Class cls13 = (Class) cjk.a.getValue();
                    if (cls13 != null) {
                        return cls13.getMethod(wk8.b("dc686c5a3d091c923f181fb3280721b22e091aba3b0f0daf"), null);
                    }
                    return null;
                } catch (Exception unused16) {
                    return null;
                }
        }
    }
}
