import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class binarySearchJSTest {
    //1st array
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
          //index:0, 1, 2, 3, 4, 5, 6, 7, 8
    //2nd array
     int[] nums2 =  {3, 7, 11, 12, 15, 22};
           //index:  0, 1,  2,  3,  4,  5,

    @Test
    void binarySearchJS1()
    {
        int expected = 0;//index
        int actual = binarySearchJS.BinarySearchJS(nums,1);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS3()
    {
        int expected = 2;//index
        int actual = binarySearchJS.BinarySearchJS(nums,3);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS5()
    {
        int expected = 4;//index
        int actual = binarySearchJS.BinarySearchJS(nums,5);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS7()
    {
        int expected = 6;//index
        int actual = binarySearchJS.BinarySearchJS(nums,7);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS9()
    {
        int expected = 8;//index
        int actual = binarySearchJS.BinarySearchJS(nums,9);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS2()
    {
        int expected = 1;//index
        int actual = binarySearchJS.BinarySearchJS(nums,2);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS4()
    {
        int expected = 3;//index
        int actual = binarySearchJS.BinarySearchJS(nums,4);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS6()
    {
        int expected = 5;//index
        int actual = binarySearchJS.BinarySearchJS(nums,6);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS8()
    {
        int expected = 7;//index
        int actual = binarySearchJS.BinarySearchJS(nums,8);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS10()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums,10);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS15()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums,15);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS999999999()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums,999999999);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJSN1()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums,-1);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJSN11()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums,-11);//number we are looking for
        assertEquals(expected, actual);
    }
    //2nd array tests
    @Test
    void binarySearchJS3second()
    {
        int expected = 0;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,3);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS7second()
    {
        int expected = 1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,7);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS11second()
    {
        int expected = 2;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,11);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS12second()
    {
        int expected = 3;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,12);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS15second()
    {
        int expected = 4;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,15);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS22second()
    {
        int expected = 5;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,22);//number we are looking for
        assertEquals(expected, actual);
    }
    //checks for gaps
    @Test
    void binarySearchJS0second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,0);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS1second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,1);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS2second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,2);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS4second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,4);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS5second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,5);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS6second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,6);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS8second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,8);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS9second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,9);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS10second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,10);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS13second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,13);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS14second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,14);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS16second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,16);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS17second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,17);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS18second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,18);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS19second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,19);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS20second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,20);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS21second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,21);//number we are looking for
        assertEquals(expected, actual);
    }
    //checking for extremes
    @Test
    void binarySearchJSN999999999second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,-999999999);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJSN100second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,-100);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJSN10second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,-10);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJSN1second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,-1);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS999999999second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,999999999);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS100second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,100);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS23second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,23);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJS24second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,24);//number we are looking for
        assertEquals(expected, actual);
    }
    @Test
    void binarySearchJSN25second()
    {
        int expected = -1;//index
        int actual = binarySearchJS.BinarySearchJS(nums2,25);//number we are looking for
        assertEquals(expected, actual);
    }
}