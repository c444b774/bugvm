/*
 * Copyright (C) 2013-2015 RoboVM AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bugvm.bindings.AVFoundation;

/*<imports>*/
import java.io.*;
import java.nio.*;
import java.util.*;
import com.bugvm.objc.*;
import com.bugvm.objc.annotation.*;
import com.bugvm.objc.block.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
import com.bugvm.apple.foundation.*;
import com.bugvm.apple.corefoundation.*;
import com.bugvm.apple.dispatch.*;
import com.bugvm.apple.coreanimation.*;
import com.bugvm.apple.coreimage.*;
import com.bugvm.apple.coregraphics.*;
import com.bugvm.apple.coreaudio.*;
import com.bugvm.apple.coremedia.*;
import com.bugvm.apple.corevideo.*;
import com.bugvm.apple.mediatoolbox.*;
import com.bugvm.apple.audiotoolbox.*;
import com.bugvm.apple.audiounit.*;
/*</imports>*/

/*<javadoc>*/
/*</javadoc>*/
/*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
@Marshaler(/*<name>*/AVVideoScalingMode/*</name>*/.Marshaler.class)
/*<visibility>*/public/*</visibility>*/ class /*<name>*/AVVideoScalingMode/*</name>*/ 
    extends /*<extends>*/GlobalValueEnumeration<NSString>/*</extends>*/
    /*<implements>*//*</implements>*/ {

    static { Bro.bind(/*<name>*/AVVideoScalingMode/*</name>*/.class); }

    /*<marshalers>*/
    public static class Marshaler {
        @MarshalsPointer
        public static AVVideoScalingMode toObject(Class<AVVideoScalingMode> cls, long handle, long flags) {
            NSString o = (NSString) NSObject.Marshaler.toObject(NSString.class, handle, flags);
            if (o == null) {
                return null;
            }
            return AVVideoScalingMode.valueOf(o);
        }
        @MarshalsPointer
        public static long toNative(AVVideoScalingMode o, long flags) {
            if (o == null) {
                return 0L;
            }
            return NSObject.Marshaler.toNative(o.value(), flags);
        }
    }
    public static class AsListMarshaler {
        @SuppressWarnings("unchecked")
        @MarshalsPointer
        public static List<AVVideoScalingMode> toObject(Class<? extends NSObject> cls, long handle, long flags) {
            NSArray<NSString> o = (NSArray<NSString>) NSObject.Marshaler.toObject(NSArray.class, handle, flags);
            if (o == null) {
                return null;
            }
            List<AVVideoScalingMode> list = new ArrayList<>();
            for (int i = 0; i < o.size(); i++) {
                list.add(AVVideoScalingMode.valueOf(o.get(i)));
            }
            return list;
        }
        @MarshalsPointer
        public static long toNative(List<AVVideoScalingMode> l, long flags) {
            if (l == null) {
                return 0L;
            }
            NSArray<NSString> array = new NSMutableArray<>();
            for (AVVideoScalingMode o : l) {
                array.add(o.value());
            }
            return NSObject.Marshaler.toNative(array, flags);
        }
    }
    /*</marshalers>*/

    /*<constants>*/
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final AVVideoScalingMode Fit = new AVVideoScalingMode("Fit");
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final AVVideoScalingMode Resize = new AVVideoScalingMode("Resize");
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final AVVideoScalingMode ResizeAspect = new AVVideoScalingMode("ResizeAspect");
    /**
     * @since Available in iOS 5.0 and later.
     */
    public static final AVVideoScalingMode ResizeAspectFill = new AVVideoScalingMode("ResizeAspectFill");
    /*</constants>*/
    
    private static /*<name>*/AVVideoScalingMode/*</name>*/[] values = new /*<name>*/AVVideoScalingMode/*</name>*/[] {/*<value_list>*/Fit, Resize, ResizeAspect, ResizeAspectFill/*</value_list>*/};
    
    /*<name>*/AVVideoScalingMode/*</name>*/ (String getterName) {
        super(Values.class, getterName);
    }
    
    public static /*<name>*/AVVideoScalingMode/*</name>*/ valueOf(/*<type>*/NSString/*</type>*/ value) {
        for (/*<name>*/AVVideoScalingMode/*</name>*/ v : values) {
            if (v.value().equals(value)) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + value + " found in " 
            + /*<name>*/AVVideoScalingMode/*</name>*/.class.getName());
    }
    
    /*<methods>*//*</methods>*/
    
    /*<annotations>*/@Library("AVFoundation") @StronglyLinked/*</annotations>*/
    public static class Values {
    	static { Bro.bind(Values.class); }

        /*<values>*/
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="AVVideoScalingModeFit", optional=true)
        public static native NSString Fit();
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="AVVideoScalingModeResize", optional=true)
        public static native NSString Resize();
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="AVVideoScalingModeResizeAspect", optional=true)
        public static native NSString ResizeAspect();
        /**
         * @since Available in iOS 5.0 and later.
         */
        @GlobalValue(symbol="AVVideoScalingModeResizeAspectFill", optional=true)
        public static native NSString ResizeAspectFill();
        /*</values>*/
    }
}
