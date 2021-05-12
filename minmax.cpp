#include<iostream>
using namespace std;
int find_min(int a[], int n);
int find_max(int a[], int n);
int main()
{
    int a[20];
    
    int n;
    cout<<"enter the number of elements in array\n";
    cin>>n;
    cout<<"Enter the elements";
    for(int i = 0;i<n;i++)
        cin>>a[i];
    
    int min = find_min(a,n);
    int max = find_max(a,n);
    cout<<"Min element in the array is : "<<min<<"\n";
    cout<<"Max element in the array is : "<<max<<"\n";
    return 0;
}

int find_min(int a[], int n)
{
    int min = a[0];
    for(int i = 0;i<n;i++)
        {
            if(min>a[i])
                min=a[i];
        }

    return min;
}

int find_max(int a[], int n)
{   
    int max=a[0];
    for(int i = 0;i<n;i++)
        {
            if(max<a[i])
                max=a[i];
        }

    return max;
}