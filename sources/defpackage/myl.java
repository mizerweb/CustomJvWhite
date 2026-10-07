package defpackage;

import android.graphics.Rect;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

/* JADX INFO: loaded from: classes2.dex */
public abstract class myl {
    public static volatile c79 a;

    /* JADX WARN: Code duplicated, block: B:24:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0043 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:29:0x004c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    public static boolean a(int i, Rect rect, Rect rect2, Rect rect3) {
        int iE;
        int i2;
        int i3;
        boolean zB = b(i, rect, rect2);
        if (!b(i, rect, rect3) && zB) {
            if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        if (rect.bottom <= rect3.top) {
                            if (i != 17 && i != 66) {
                                iE = e(i, rect, rect2);
                                if (i != 17) {
                                    i2 = rect.left;
                                    i3 = rect3.left;
                                } else if (i != 33) {
                                    i2 = rect.top;
                                    i3 = rect3.top;
                                } else if (i != 66) {
                                    i2 = rect3.right;
                                    i3 = rect.right;
                                } else {
                                    if (i == 130) {
                                        ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                        return false;
                                    }
                                    i2 = rect3.bottom;
                                    i3 = rect.bottom;
                                }
                                if (iE < Math.max(1, i2 - i3)) {
                                }
                            }
                        }
                    } else if (rect.right <= rect3.left) {
                        if (i != 17) {
                            iE = e(i, rect, rect2);
                            if (i != 17) {
                                i2 = rect.left;
                                i3 = rect3.left;
                            } else if (i != 33) {
                                i2 = rect.top;
                                i3 = rect3.top;
                            } else if (i != 66) {
                                i2 = rect3.right;
                                i3 = rect.right;
                            } else {
                                if (i == 130) {
                                    ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                    return false;
                                }
                                i2 = rect3.bottom;
                                i3 = rect.bottom;
                            }
                            if (iE < Math.max(1, i2 - i3)) {
                            }
                        }
                    }
                } else if (rect.top >= rect3.bottom) {
                    if (i != 17) {
                        iE = e(i, rect, rect2);
                        if (i != 17) {
                            i2 = rect.left;
                            i3 = rect3.left;
                        } else if (i != 33) {
                            i2 = rect.top;
                            i3 = rect3.top;
                        } else if (i != 66) {
                            i2 = rect3.right;
                            i3 = rect.right;
                        } else {
                            if (i == 130) {
                                ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                                return false;
                            }
                            i2 = rect3.bottom;
                            i3 = rect.bottom;
                        }
                        if (iE < Math.max(1, i2 - i3)) {
                        }
                    }
                }
            } else if (rect.left >= rect3.right) {
                if (i != 17) {
                    iE = e(i, rect, rect2);
                    if (i != 17) {
                        i2 = rect.left;
                        i3 = rect3.left;
                    } else if (i != 33) {
                        i2 = rect.top;
                        i3 = rect3.top;
                    } else if (i != 66) {
                        i2 = rect3.right;
                        i3 = rect.right;
                    } else {
                        if (i == 130) {
                            ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                            return false;
                        }
                        i2 = rect3.bottom;
                        i3 = rect.bottom;
                    }
                    if (iE < Math.max(1, i2 - i3)) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0025  */
    public static boolean b(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                } else if (rect2.bottom < rect.top) {
                }
            }
            if (rect2.right >= rect.left && rect2.left <= rect.right) {
                return true;
            }
        } else if (rect2.bottom < rect.top && rect2.top <= rect.bottom) {
            return true;
        }
        return false;
    }

    public static final qxh c(String str) {
        c79 c79VarJ = a;
        if (c79VarJ == null) {
            c79 c79VarW = yab.w();
            try {
                Iterator it = Arrays.asList(new uwh()).iterator();
                while (it.hasNext()) {
                    c79VarW.add(it.next());
                }
                a = c79VarW;
                c79VarJ = yab.j(c79VarW);
            } catch (Throwable th) {
                throw new ServiceConfigurationError(th.getMessage(), th);
            }
        }
        if (c79VarJ.getSize() > 1) {
            ore.c("More then one manifest found: ".concat(ww3.z1(c79VarJ, null, null, null, rl0.o, 31)));
            return null;
        }
        if (c79VarJ.getSize() == 1) {
            qxh qxhVar = (qxh) c79VarJ.get(0);
            qxhVar.getClass();
            if ("ru.oneme.app".equals(str)) {
                return qxhVar;
            }
            ore.c(c0a.o("Unexpected ", qxhVar.getClass().getName(), ".applicationId()"));
        }
        return null;
    }

    public static boolean d(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            if ((i2 > i3 || rect.left >= i3) && rect.left > rect2.left) {
                return true;
            }
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            if ((i4 > i5 || rect.top >= i5) && rect.top > rect2.top) {
                return true;
            }
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            if ((i6 < i7 || rect.right <= i7) && rect.right < rect2.right) {
                return true;
            }
        } else {
            if (i != 130) {
                ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            int i8 = rect.top;
            int i9 = rect2.top;
            if ((i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom) {
                return true;
            }
        }
        return false;
    }

    public static int e(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return 0;
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int f(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        ore.p("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return 0;
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }
}
