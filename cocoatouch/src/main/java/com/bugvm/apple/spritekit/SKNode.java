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
package com.bugvm.apple.spritekit;

/*<imports>*/
import java.io.*;

import com.bugvm.apple.coregraphics.CGPoint;
import com.bugvm.apple.coregraphics.CGRect;
import com.bugvm.apple.foundation.NSArray;
import com.bugvm.apple.foundation.NSCoder;
import com.bugvm.apple.foundation.NSCoding;
import com.bugvm.apple.foundation.NSMutableDictionary;
import com.bugvm.apple.gameplaykit.GKPolygonObstacle;
import com.bugvm.apple.uikit.UIResponder;
import com.bugvm.objc.ObjCRuntime;
import com.bugvm.objc.annotation.Block;
import com.bugvm.objc.annotation.Method;
import com.bugvm.objc.annotation.NativeClass;
import com.bugvm.objc.annotation.Property;
import com.bugvm.objc.block.VoidBlock2;
import com.bugvm.objc.*;
import com.bugvm.rt.*;
import com.bugvm.rt.annotation.*;
import com.bugvm.rt.bro.*;
import com.bugvm.rt.bro.annotation.*;
import com.bugvm.rt.bro.ptr.*;
/*</imports>*/

/*<javadoc>*/

/*</javadoc>*/
/*<annotations>*/@Library("SpriteKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKNode/*</name>*/ 
    extends /*<extends>*/UIResponder/*</extends>*/
    /*<implements>*/implements NSCoding/*</implements>*/ {

    /*<ptr>*/public static class SKNodePtr extends Ptr<SKNode, SKNodePtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKNode.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKNode() {}
    protected SKNode(long handle) { super(handle); }
    protected SKNode(SkipInit skipInit) { super(skipInit); }
    public SKNode(NSCoder aDecoder) { super((SkipInit) null); initObject(init(aDecoder)); }
    public SKNode(String filename) { super(create(filename)); retain(getHandle()); }
    /*</constructors>*/
    public SKNode(File file) {
        this(file.getAbsolutePath());
    }
    /*<properties>*/
    @Property(selector = "frame")
    public native @ByVal
    CGRect getFrame();
    @Property(selector = "position")
    public native @ByVal
    CGPoint getPosition();
    @Property(selector = "setPosition:")
    public native void setPosition(@ByVal CGPoint v);
    @Property(selector = "zPosition")
    public native @MachineSizedFloat double getZPosition();
    @Property(selector = "setZPosition:")
    public native void setZPosition(@MachineSizedFloat double v);
    @Property(selector = "zRotation")
    public native @MachineSizedFloat double getZRotation();
    @Property(selector = "setZRotation:")
    public native void setZRotation(@MachineSizedFloat double v);
    @Property(selector = "xScale")
    public native @MachineSizedFloat double getXScale();
    @Property(selector = "setXScale:")
    public native void setXScale(@MachineSizedFloat double v);
    @Property(selector = "yScale")
    public native @MachineSizedFloat double getYScale();
    @Property(selector = "setYScale:")
    public native void setYScale(@MachineSizedFloat double v);
    @Property(selector = "speed")
    public native @MachineSizedFloat double getSpeed();
    @Property(selector = "setSpeed:")
    public native void setSpeed(@MachineSizedFloat double v);
    @Property(selector = "alpha")
    public native @MachineSizedFloat double getAlpha();
    @Property(selector = "setAlpha:")
    public native void setAlpha(@MachineSizedFloat double v);
    @Property(selector = "isPaused")
    public native boolean isPaused();
    @Property(selector = "setPaused:")
    public native void setPaused(boolean v);
    @Property(selector = "isHidden")
    public native boolean isHidden();
    @Property(selector = "setHidden:")
    public native void setHidden(boolean v);
    @Property(selector = "isUserInteractionEnabled")
    public native boolean isUserInteractionEnabled();
    @Property(selector = "setUserInteractionEnabled:")
    public native void setUserInteractionEnabled(boolean v);
    @Property(selector = "parent")
    public native SKNode getParent();
    @Property(selector = "children")
    public native NSArray<SKNode> getChildren();
    @Property(selector = "name")
    public native String getName();
    @Property(selector = "setName:")
    public native void setName(String v);
    @Property(selector = "scene")
    public native SKScene getScene();
    @Property(selector = "physicsBody")
    public native SKPhysicsBody getPhysicsBody();
    @Property(selector = "setPhysicsBody:")
    public native void setPhysicsBody(SKPhysicsBody v);
    @Property(selector = "userData")
    public native NSMutableDictionary<?, ?> getUserData();
    @Property(selector = "setUserData:")
    public native void setUserData(NSMutableDictionary<?, ?> v);
    @Property(selector = "reachConstraints")
    public native SKReachConstraints getReachConstraints();
    @Property(selector = "setReachConstraints:")
    public native void setReachConstraints(SKReachConstraints v);
    @Property(selector = "constraints")
    public native NSArray<SKConstraint> getConstraints();
    @Property(selector = "setConstraints:")
    public native void setConstraints(NSArray<SKConstraint> v);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithCoder:")
    protected native @Pointer long init(NSCoder aDecoder);
    @Method(selector = "calculateAccumulatedFrame")
    public native @ByVal CGRect calculateAccumulatedFrame();
    @Method(selector = "setScale:")
    public native void setScale(@MachineSizedFloat double scale);
    @Method(selector = "addChild:")
    public native void addChild(SKNode node);
    @Method(selector = "insertChild:atIndex:")
    public native void insertChild(SKNode node, @MachineSizedSInt long index);
    @Method(selector = "removeChildrenInArray:")
    public native void removeChildren(NSArray<SKNode> nodes);
    @Method(selector = "removeAllChildren")
    public native void removeAllChildren();
    @Method(selector = "removeFromParent")
    public native void removeFromParent();
    @Method(selector = "moveToParent:")
    public native void moveToParent(SKNode parent);
    @Method(selector = "childNodeWithName:")
    public native SKNode getChild(String name);
    @Method(selector = "enumerateChildNodesWithName:usingBlock:")
    public native void enumerateChildNodes(String name, @Block VoidBlock2<SKNode, BooleanPtr> block);
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Method(selector = "objectForKeyedSubscript:")
    public native NSArray<SKNode> findNodesByName(String name);
    @Method(selector = "inParentHierarchy:")
    public native boolean isInParentHierarchy(SKNode parent);
    @Method(selector = "runAction:")
    public native void runAction(SKAction action);
    @Method(selector = "runAction:completion:")
    public native void runAction(SKAction action, @Block Runnable block);
    @Method(selector = "runAction:withKey:")
    public native void runAction(SKAction action, String key);
    @Method(selector = "hasActions")
    public native boolean hasActions();
    @Method(selector = "actionForKey:")
    public native SKAction getAction(String key);
    @Method(selector = "removeActionForKey:")
    public native void removeAction(String key);
    @Method(selector = "removeAllActions")
    public native void removeAllActions();
    @Method(selector = "containsPoint:")
    public native boolean containsPoint(@ByVal CGPoint p);
    @Method(selector = "nodeAtPoint:")
    public native SKNode getNodeAtPoint(@ByVal CGPoint p);
    @Method(selector = "nodesAtPoint:")
    public native NSArray<SKNode> getNodesAtPoint(@ByVal CGPoint p);
    @Method(selector = "convertPoint:fromNode:")
    public native @ByVal CGPoint convertPointFromNode(@ByVal CGPoint point, SKNode node);
    @Method(selector = "convertPoint:toNode:")
    public native @ByVal CGPoint convertPointToNode(@ByVal CGPoint point, SKNode node);
    @Method(selector = "intersectsNode:")
    public native boolean intersectsNode(SKNode node);
    @Method(selector = "isEqualToNode:")
    public native boolean equalsTo(SKNode node);
    @Method(selector = "nodeWithFileNamed:")
    protected static native @Pointer long create(String filename);
    @Method(selector = "obstaclesFromSpriteTextures:accuracy:")
    public static native NSArray<GKPolygonObstacle> getObstaclesFromSpriteTextures(NSArray<SKNode> sprites, float accuracy);
    @Method(selector = "obstaclesFromNodeBounds:")
    public static native NSArray<GKPolygonObstacle> getObstaclesFromNodeBounds(NSArray<SKNode> nodes);
    @Method(selector = "obstaclesFromNodePhysicsBodies:")
    public static native NSArray<GKPolygonObstacle> getObstaclesFromNodePhysicsBodies(NSArray<SKNode> nodes);
    @Method(selector = "encodeWithCoder:")
    public native void encode(NSCoder coder);
    /*</methods>*/
}